package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUIv1Test {

    @Test
    public void whenCreatItem() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUIv1(out).init(in, tracker, action);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Old name"));
        String replaceName = "New item name";
        Input in = new StabInput(
                new String[] {"0", item.getId(), replaceName, "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUIv1(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUIv1(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        0 + ". " + "Exit" + System.lineSeparator() +
                        "Exit." + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[]{"0", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindAction(out),
                new ExitAction(out)
        };
        new StartUIv1(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. === Show all items ====" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all items ====" + System.lineSeparator()
                        + "_________________________________________________________________________" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. === Show all items ====" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Exit." + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindName() {
        Output out = new StubOutput();
        String name = "name";
        Input input = new StabInput(
                new String[] {"0", name , "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(name));
        UserAction[] actions = {
                new FindNAction(out),
                new ExitAction(out)
        };
        new StartUIv1(out).init(input, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. === Find item by name ===" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "0. " + item.getName() + " : " + item.getId() + System.lineSeparator()
                + "_________________________________________________________________________" + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. === Find item by name ===" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "Exit." + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindId() {
        Output out = new StubOutput();
        String name = "name";
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item(name));
        Input input = new StabInput(
                new String[] {"0", item.getId() , "1"}
        );

        UserAction[] actions = {
                new FindIAction(out),
                new ExitAction(out)
        };
        new StartUIv1(out).init(input, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. === Find item by id ===" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + item.getName() + " : " + item.getId() + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. === Find item by id ===" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Exit." + System.lineSeparator()
        ));
    }

}
