package ru.job4j.tracker;

import java.util.List;

public class ShowAction implements UserAction {
    @Override
    public String name(){
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input pInput, Tracker pTracker) {
        int position = 0;
        List<Item> steck = pTracker.findAll();
        for (Item items : steck) {
            System.out.println(position++ + ". " + items.getName() + " : " + items.getId());
        }
        System.out.println("_________________________________________________________________________");
        return true;
    }

}
