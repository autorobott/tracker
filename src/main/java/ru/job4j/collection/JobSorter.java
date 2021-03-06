package ru.job4j.collection;

import ru.job4j.bank.SortByNameJob;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByNameMax().thenComparing(new JobDescByPriorityMax()));
        System.out.println(jobs);
    }
}
