package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        System.out.println("Exit.");
        return false;
    }
}
