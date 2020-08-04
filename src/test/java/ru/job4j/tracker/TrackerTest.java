package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findByNameTest() {
        Tracker trackerTest = new Tracker();
        List<Item> expected = Arrays.asList(
                trackerTest.add(new Item("name1"))
        );
        assertThat(expected, is(trackerTest.findByName("name1")));
    }

    @Test
    public void findAllTest() {
        Tracker trackerTest = new Tracker();
        List<Item> expected = Arrays.asList(
                trackerTest.add(new Item("name1")),
                trackerTest.add(new Item("name2"))
        );
        assertThat(expected, is(trackerTest.findAll()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
       tracker.findById(id);
    }

}