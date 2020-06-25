package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        String id = pInput.askStr("Enter id: ");
        out.printLn("=== Creat new item ===");
        Item newItem = new Item(pInput.askStr("Enter name: "));
        if (pTracker.replace(id, newItem)) {
            out.printLn(">>Successfully");
        } else {
            out.printLn(">>ERROR");
        }
        return true;
    }
}
