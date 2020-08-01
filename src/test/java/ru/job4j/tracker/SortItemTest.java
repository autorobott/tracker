package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SortItemTest {
    @Test
public void whenSortItemMin() {
        List<Item> in = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        List<Item> expected = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C")
        );
        Collections.sort(in, new SortItemMax());
        assertThat(expected, is(in));
    }
    @Test
    public void whenSortItemMax() {
        List<Item> in = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        List<Item> expected = Arrays.asList(
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        Collections.sort(in, new SortItemMin());
        assertThat(expected, is(in));
    }
}
