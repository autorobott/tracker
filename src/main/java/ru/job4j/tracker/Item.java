package ru.job4j.tracker;

import ru.job4j.collection.Job;

import javax.lang.model.element.Name;
import java.util.Objects;

import static java.lang.CharSequence.compare;

public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String pName) {
        name = pName;
    }

    public String getId() {
        return id;
    }

    public void setId(String pId) {
        id = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Item that = (Item) o;
        return Objects.equals(name, that.getName())
                && Objects.equals(id, that.getId());
    }

    @Override
    public String toString() {
        return "Item{"
                + "name='"
                + name
                + '\''
                + ", priority=" + id
                + '}';
    }

    @Override
    public int compareTo(Item another) {
        return compare(name, another.getName());
    }
}
