package ru.job4j.pojo;

public class Book {
    private String nameBook;
    private int pages;

    public Book(String pNameBook, int pPages) {
        nameBook = pNameBook;
        pages = pPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String pNameBook) {
        nameBook = pNameBook;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pPages) {
        pages = pPages;
    }
}
