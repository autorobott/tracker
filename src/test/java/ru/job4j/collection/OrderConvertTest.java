package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
      List<Order> in = new ArrayList<>();
      in.add(new Order("asdf", "asdfg"));
        HashMap<String, Order> map = OrderConvert.process(in);
        assertThat(map.get("asdf"), is(new Order("asdf", "asdfg")));

    }
}
