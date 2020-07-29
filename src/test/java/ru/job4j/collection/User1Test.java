package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class User1Test {
    @Test
    public void whenAsc() {
        Set<User1> users = new TreeSet<>();
        users.add(new User1("Petr", 32));
        users.add(new User1("Ivan", 31));
        Iterator<User1> it = users.iterator();
        assertThat(it.next(), is(new User1("Ivan", 31)));
        assertThat(it.next(), is(new User1("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User1("Petr", 32)
                .compareTo(
                        new User1("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}