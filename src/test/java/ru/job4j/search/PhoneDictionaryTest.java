package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDicInter phones = new PhoneDictionary();
        phones.add(
                new Person("Nikolay", "Ovchennikov", "89145849834", "Koroleva 50")
        );
        ArrayList<Person> perOut = phones.find("Nikolay");
        assertThat(perOut.get(0).getName(), is("Nikolay"));
    }
}
