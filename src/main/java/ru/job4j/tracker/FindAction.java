package ru.job4j.tracker;

public class FindAction implements UserAction {
    private final Output out;

    public FindAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        out.printLn("=== Show all items ====");
        int position = 0;
        Item[] prtItems = pTracker.findAll();
        for (Item items : prtItems) {
            out.printLn(position++ + ". " + items.getName() + " : " + items.getId());
        }
        out.printLn("_________________________________________________________________________");
        return true;
    }
}
