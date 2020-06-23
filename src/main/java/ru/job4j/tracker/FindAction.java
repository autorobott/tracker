package ru.job4j.tracker;

public class FindAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        Item findItem = pTracker.findById(pInput.askStr("Enter id: "));
        if (findItem != null) {
            System.out.println(findItem.getName() + " : " + findItem.getId());
        } else {
            System.out.println("There is no such item !");
        }
        return true;
    }
}
