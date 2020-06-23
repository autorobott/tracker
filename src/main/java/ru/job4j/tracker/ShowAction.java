package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name(){
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        int position = 0;
        Item[] prtItems = pTracker.findAll();
        for (Item items : prtItems) {
            System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
        }
        System.out.println("_________________________________________________________________________");
        return true;
    }

}
