package ru.job4j.search;

public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String pName, String pSurname, String pPhone, String pAddress) {
        name = pName;
        surname = pSurname;
        phone = pPhone;
        address = pAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
