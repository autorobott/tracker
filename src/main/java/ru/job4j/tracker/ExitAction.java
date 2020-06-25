package ru.job4j.tracker;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output pOut) {
        out = pOut;
    }

    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        out.printLn("Exit.");
        return false;
    }
}
