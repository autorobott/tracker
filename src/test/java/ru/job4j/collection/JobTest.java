package ru.job4j.collection;

import org.junit.Test;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenJobDescNameMax() {
        List<Job> in = Arrays.asList(
                new Job("A", 3),
                new Job("C", 1),
                new Job("B", 2)
        );
        List<Job> expect = Arrays.asList(
                new Job("C", 1),
                new Job("B", 2),
                new Job("A", 3)
        );
        Collections.sort(in, new JobDescByNameMin());
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescNameMin() {
        List<Job> in = Arrays.asList(
                new Job("A", 3),
                new Job("C", 1),
                new Job("B", 2)
        );
        List<Job> expect = Arrays.asList(
                new Job("A", 3),
                new Job("B", 2),
                new Job("C", 1)
        );
        Collections.sort(in, new JobDescByNameMax());
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescPriorityMax() {
        List<Job> in = Arrays.asList(
                new Job("A", 3),
                new Job("C", 1),
                new Job("B", 2)
        );
        List<Job> expect = Arrays.asList(
                new Job("A", 3),
                new Job("B", 2),
                new Job("C", 1)
        );
        Collections.sort(in, new JobDescByPriorityMax());
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescPriorityMin() {
        List<Job> in = Arrays.asList(
                new Job("A", 3),
                new Job("C", 1),
                new Job("B", 2)
        );
        List<Job> expect = Arrays.asList(
                new Job("C", 1),
                new Job("B", 2),
                new Job("A", 3)
        );
        Collections.sort(in, new JobDescByPriorityMin());
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescNameMaxPriotityMin() {
        List<Job> in = Arrays.asList(
                new Job("A", 3),
                new Job("A", 2),
                new Job("A", 1)
        );
        List<Job> expect = Arrays.asList(
                new Job("A", 1),
                new Job("A", 2),
                new Job("A", 3)
        );
        Collections.sort(in, new JobDescByNameMax().thenComparing(new JobDescByPriorityMax()));
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescNameMinPriorityMax() {
        List<Job> in = Arrays.asList(
                new Job("A", 3),
                new Job("A", 1),
                new Job("A", 2)
        );
        List<Job> expect = Arrays.asList(
                new Job("A", 3),
                new Job("A", 2),
                new Job("A", 1)
        );
        Collections.sort(in, new JobDescByNameMin().thenComparing(new JobDescByPriorityMin()));
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescPriorityMaxNameMin() {
        List<Job> in = Arrays.asList(
                new Job("A", 1),
                new Job("B", 1),
                new Job("C", 1)
        );
        List<Job> expect = Arrays.asList(
                new Job("C", 1),
                new Job("B", 1),
                new Job("A", 1)
        );
        Collections.sort(in, new JobDescByPriorityMax().thenComparing(new JobDescByNameMin()));
        assertThat(expect, is(in));
    }

    @Test
    public void whenJobDescPriorityMinNameMax() {
        List<Job> in = Arrays.asList(
                new Job("A", 1),
                new Job("C", 1),
                new Job("B", 1)
        );
        List<Job> expect = Arrays.asList(
                new Job("A", 1),
                new Job("B", 1),
                new Job("C", 1)
        );
        Collections.sort(in, new JobDescByPriorityMin().thenComparing(new JobDescByNameMax()));
        assertThat(expect, is(in));
    }
}
