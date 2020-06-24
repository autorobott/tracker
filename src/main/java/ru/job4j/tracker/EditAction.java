package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        String id = pInput.askStr("Enter id: ");
        System.out.println("=== Creat new item ===");
        Item newItem = new Item(pInput.askStr("Enter name: "));
        if (pTracker.replace(id, newItem)) {
            System.out.println(">>Successfully");
        } else {
            System.out.println(">>ERROR");
        }
        return true;
    }
}
