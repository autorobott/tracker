package ru.job4j.tracker;

public class FindNAction implements UserAction {
    private final Output out;

    public FindNAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        int position = 0;
        Item[] findItems = pTracker.findByName(pInput.askStr("Enter name: "));
        for (Item items : findItems) {
            out.printLn(position++ + ". " + items.getName() + " : " + items.getId());
        }
        out.printLn("_________________________________________________________________________");
        return true;
    }
}
