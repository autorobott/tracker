package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner pScanner, Tracker pTracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int selectMenu = Integer.valueOf(pScanner.nextLine());
            String name;
            String id;
            switch (selectMenu) {
                case 0:
                    System.out.println("=== Create a new Item ====");
                    System.out.print("Enter name: ");
                    Item item = new Item(pScanner.nextLine());
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
                    System.out.print("Enter id: ");
                    id = pScanner.nextLine();
                    System.out.println("=== Creat new item ===");
                    System.out.print("Enter name: ");
                    name = pScanner.nextLine();
                    Item newItem = new Item(name);
                    pTracker.replace(id, newItem);
                    break;
                case 3:
                    System.out.println("=== Delet item ===");
                    System.out.print("Enter id:");
                    pTracker.delete(pScanner.nextLine());
                    break;
                case 4:
                    System.out.println("=== Find item by id ===");
                    System.out.print("Enter id: ");
                    Item findItem = pTracker.findById(pScanner.nextLine());
                    if (findItem != null) {
                        System.out.println(findItem.getName() + " : " + findItem.getId());
                    } else {
                        System.out.println("There is no such item !");
                    }
                    break;
                case 5:
                    position = 0;
                    System.out.println("=== Find item by name ===");
                    System.out.print("Enter name: ");
                    Item[] findItems = pTracker.findByName(pScanner.nextLine());
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
        System.out.print("Select:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
