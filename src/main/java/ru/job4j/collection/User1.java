package ru.job4j.collection;

import java.util.Objects;


public class User1 implements Comparable<User1> {
    private String name;
    private int age;

    public User1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User1 o)  {
        int rsl = name.compareTo(o.getName());
        if (rsl == 0) {
            rsl = Integer.compare(age, getAge());
        }
     return rsl;
    }
        @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User1 user1 = (User1) obj;
        return age == user1.age && Objects.equals(name, user1.name);
    }
}
