package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax1To2Then11() {
        assertThat(Max.max(2, 1), is(2));
    }
    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax0To2Then0() {
        int result = Max.max(2, 0);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax0To2Then01() {
        int result = Max.max(-1, 0);
        assertThat(result, is(0));
    }
    @Test
    public void whenMax0To2Then02() {
        int result = Max.max(0, -1);
        assertThat(result, is(0));
    }
    @Test
    public void whenMax0To2Then03() {
        int result = Max.max(-1, -2);
        assertThat(result, is(-1));
    }
    @Test
    public void whenMax0To2Then04() {
        int result = Max.max(-2, -1);
        assertThat(result, is(-1));
    }
    @Test
    public void maximumNumber3Then1() {
        int result = Max.max(3, 1, 2);
        assertThat(result, is(3));
    }
    @Test
    public void maximumNumber3Then2() {
        int result = Max.max(1, 3, 2);
        assertThat(result, is(3));
    }
    @Test
    public void maximumNumber3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void maximumNumber4Then1() {
        int result = Max.max(4, 1, 2, 3);
        assertThat(result, is(4));
    }
    @Test
    public void maximumNumber4Then2() {
        int result = Max.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }
    @Test
    public void maximumNumber4Then3() {
        int result = Max.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }
    @Test
    public void maximumNumber4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
