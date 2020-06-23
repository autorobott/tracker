package ru.job4j.tracker;

public class FindNAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        int position = 0;
        Item[] findItems = pTracker.findByName(pInput.askStr("Enter name: "));
        for (Item items : findItems) {
            System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
        }
        System.out.println("_________________________________________________________________________");
        return true;
    }
}
