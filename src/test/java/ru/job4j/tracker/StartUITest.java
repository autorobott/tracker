package ru.job4j.tracker;

import org.junit.Test;
/*
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StabInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        StartUI.editItem(new StabInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
    @Test
    public void whenDeletItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("delete item");
        tracker.add(item);
        String[] answers = {item.getId(), item.getName()};
        StartUI.deletItem(new StabInput(answers), tracker);
        Item deletItems = tracker.findById(item.getId());
        assertThat(deletItems, is(nullValue()));
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
                        "0. Exit" + System.lineSeparator() +
                        "Exit." + System.lineSeparator()
        ));
    }

}

 */

