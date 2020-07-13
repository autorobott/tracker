package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        Item findItem = pTracker.findById(pInput.askStr("Enter id: "));
        if (findItem != null) {
            out.printLn(findItem.getName() + " : " + findItem.getId());
        } else {
            out.printLn("There is no such item !");
        }
        return true;
    }
}
