package ru.job4j;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.list.ConvertMatrix2List;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        List<Integer> expect = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = list.toList(input);
        assertThat(expect, is(result));
    }
}
