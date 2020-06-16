package ru.job4j.tracker;

public class StartUI {

    public static void createItem(Input pInput, Tracker pTracker) {
        System.out.println("=== Create a new Item ====");
        Item item = new Item(pInput.askStr("Enter name: "));
        pTracker.add(item);
    }
    public static void showAllItems(Input pInpute, Tracker pTracker) {
        System.out.println("=== Show all items ====");
        int position = 0;
        Item[] prtItems = pTracker.findAll();
        for (Item items : prtItems) {
            System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
        }
        System.out.println("_________________________________________________________________________");
    }
    public static void editItem(Input pInput, Tracker pTracker) {
        System.out.println("=== Edit item ====");
        String id = pInput.askStr("Enter id: ");
        System.out.println("=== Creat new item ===");
        Item newItem = new Item(pInput.askStr("Enter name: "));
        if (pTracker.replace(id, newItem)) {
            System.out.println(">>Successfully");
        } else {
            System.out.println(">>ERROR");
        }
    }
    public static void deletItem(Input pInput, Tracker pTracker) {
        System.out.println("=== Delet item ===");
        if (pTracker.delete(pInput.askStr("Enter id:"))) {
            System.out.println(">>Successfully");
        } else {
            System.out.println(">>ERROR");
        }
    }
    public static void findItemById(Input pInput, Tracker pTracker) {
        System.out.println("=== Find item by id ===");
        Item findItem = pTracker.findById(pInput.askStr("Enter id: "));
        if (findItem != null) {
            System.out.println(findItem.getName() + " : " + findItem.getId());
        } else {
            System.out.println("There is no such item !");
        }
    }
    public static void findItemByName(Input pInput, Tracker pTracker) {
        int position = 0;
        System.out.println("=== Find item by name ===");
        Item[] findItems = pTracker.findByName(pInput.askStr("Enter name: "));
        for (Item items : findItems) {
            System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
        }
        System.out.println("_________________________________________________________________________");
    }
    public static boolean exit() {
        System.out.println("Exit");
        return false;
    }

    public void init(Input pInput, Tracker pTracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int selectMenu = Integer.valueOf(pInput.askStr("Select: "));
            int position = 0;
            switch (selectMenu) {
                case 0:
                    createItem(pInput, pTracker);
                    break;
                case 1:
                    showAllItems(pInput, pTracker);
                    break;
                case 2:
                    editItem(pInput, pTracker);
                    break;
                case 3:
                    deletItem(pInput, pTracker);
                    break;
                case 4:
                    findItemById(pInput, pTracker);
                    break;
                case 5:
                    findItemByName(pInput, pTracker);
                    break;
                case 6:
                    run = exit();
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
        StartUI.createItem(input, tracker);
    }
}
