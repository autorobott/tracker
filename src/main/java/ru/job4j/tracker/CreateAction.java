package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        String name = pInput.askStr("Enter name: ");
        Item item = new Item(name);
        pTracker.add(item);
        return true;
    }
}
