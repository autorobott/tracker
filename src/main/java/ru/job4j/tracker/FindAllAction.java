package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output pOut) {
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
        List<Item> steck = pTracker.findAll();
        for (Item items : steck) {
            out.printLn(position++ + ". " + items.getName() + " : " + items.getId());
        }
        out.printLn("_________________________________________________________________________");
        return true;
    }
}
