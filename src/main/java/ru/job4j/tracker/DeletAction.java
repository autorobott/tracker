package ru.job4j.tracker;

public class DeletAction implements UserAction {
    @Override
    public String name() {
        return "=== Delet item ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        if (pTracker.delete(pInput.askStr("Enter id:"))) {
            System.out.println(">>Successfully");
        } else {
            System.out.println(">>ERROR");
        }
        return true;
    }
}
