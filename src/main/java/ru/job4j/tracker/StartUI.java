package ru.job4j.tracker;

//import java.util.Scanner;

public class StartUI {

    public void init(Input pInput, Tracker pTracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int selectMenu = Integer.valueOf(pInput.askStr("Select: "));
            switch (selectMenu) {
                case 0:
                    System.out.println("=== Create a new Item ====");
                    Item item = new Item(pInput.askStr("Enter name: "));
                    pTracker.add(item);
                    break;
                case 1:
                    System.out.println("=== Show all items ====");
                    int position = 0;
                    Item[] prtItems = pTracker.findAll();
                    for (Item items : prtItems) {
                        System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
                    }
                    System.out.println("_________________________________________________________________________");
                    break;
                case 2:
                    System.out.println("=== Edit item ====");
                    String id = pInput.askStr("Enter id: ");
                    System.out.println("=== Creat new item ===");
                    Item newItem = new Item(pInput.askStr("Enter name: "));
                    if (pTracker.replace(id, newItem)) {
                        System.out.println(">>Successfully");
                    } else {
                        System.out.println(">>ERROR");
                    }
                    break;
                case 3:
                    System.out.println("=== Delet item ===");
                    if (pTracker.delete(pInput.askStr("Enter id:"))) {
                        System.out.println(">>Successfully");
                    } else {
                        System.out.println(">>ERROR");
                    }
                    break;
                case 4:
                    System.out.println("=== Find item by id ===");
                    Item findItem = pTracker.findById(pInput.askStr("Enter id: "));
                    if (findItem != null) {
                        System.out.println(findItem.getName() + " : " + findItem.getId());
                    } else {
                        System.out.println("There is no such item !");
                    }
                    break;
                case 5:
                    position = 0;
                    System.out.println("=== Find item by name ===");
                    Item[] findItems = pTracker.findByName(pInput.askStr("Enter name: "));
                    for (Item items : findItems) {
                        System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
                    }
                    System.out.println("_________________________________________________________________________");
                    break;
                case 6:
                    run = false;
                    break;
                default:
            }
        }
    }

    private void showMenu() {
        System.out.println("^____Menu____^");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Programm");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
