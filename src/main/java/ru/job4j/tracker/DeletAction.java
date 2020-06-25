package ru.job4j.tracker;

public class DeletAction implements UserAction {
    private final Output out;

    public DeletAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "=== Delet item ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        if (pTracker.delete(pInput.askStr("Enter id:"))) {
            out.printLn(">>Successfully");
            } else {
            out.printLn(">>ERROR");
        }
        return true;
    }
}
