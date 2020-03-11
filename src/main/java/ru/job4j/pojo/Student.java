package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String group;
    private Date created;

    public String getFio() {
        return fio;
    }

    public void setFIO(String pFio) {
        fio = pFio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String pGroup) {
        group = pGroup;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date pCreated) {
        created = pCreated;
    }

}
