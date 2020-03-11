package ru.job4j.tracker;

import org.junit.Test;
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
        int sizeResult = 2;
        Item[] itemTest = new Item[sizeResult];
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        itemTest[0] = item1;
        itemTest[1] = item1;
        Item[] result = new Item[sizeResult];
        Tracker trackerTest = new Tracker();
        trackerTest.add(item1);
        trackerTest.add(item2);
        trackerTest.add(item1);
        trackerTest.add(item2);
        assertThat(itemTest, is(trackerTest.findByName("test1")));
    }

    @Test
    public void findAllTest() {
        int sizeResult = 3;
        Item[] itemTest = new Item[sizeResult];
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        itemTest[0] = item1;
        itemTest[1] = item2;
        itemTest[2] = item1;
        Item[] result = new Item[sizeResult];
        Tracker trackerTest = new Tracker();
        trackerTest.add(item1);
        trackerTest.add(item2);
        trackerTest.add(item1);
        assertThat(itemTest, is(trackerTest.findAll()));
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

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

}