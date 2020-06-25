package ru.job4j.tracker;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        out.printLn("=== Create a new Item ====");
        String name = pInput.askStr("Enter name: ");
        Item item = new Item(name);
        pTracker.add(item);
        return true;
    }
}
