package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = MyFunc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        List<Double> result = MyFunc.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D, 64D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenSignificantFunctionThenLinearResults() {
        List<Double> result = MyFunc.diapason(5, 8, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32D, 64D, 128D, 256D);
        assertThat(result, is(expected));
    }
}
