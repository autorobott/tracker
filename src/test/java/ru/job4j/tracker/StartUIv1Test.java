package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUIv1Test {
/*
    @Test
    public void whenCreatItem() {
        Input in = new StabInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUIv1().init(in, tracker, action);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceAction() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Old name"));
        String replaceName = "New item name";
        Input in = new StabInput(
                new String[] {"0", item.getId(), replaceName, "1"}
        );
        UserAction[] actions = {
                new EditAction(),
                new ExitAction()
        };
        new StartUIv1().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(replaceName));
    }

 */
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUIv1(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
}
