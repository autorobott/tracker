package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> account) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account buff : account) {
            rsl.add(buff);
        }
        return rsl;
    }


}
