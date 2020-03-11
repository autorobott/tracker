package ru.job4j.pojo;

import java.util.Date;

public class College {

    static public void main(String[] args) {
        Student stud1 = new Student();
        stud1.setFIO("Pupkin Vasay Fedorovich");
        stud1.setGroup("group A");
        stud1.setCreated(new Date());

        System.out.println(stud1.getFio() + " " + stud1.getGroup() + " " + stud1.getCreated());
    }
}
