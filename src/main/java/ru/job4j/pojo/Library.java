package ru.job4j.pojo;

public class Library {
    static public void printLibrary(Book[] library) {
        for (Book buff : library) {
            System.out.println(" The name of the book " + buff.getNameBook() + " and " + buff.getPages() + " pages in it.");
        }
    }
    static public void prtFilterLib(Book[] library, String nameFilter) {
        for (Book buff : library) {
            if (buff.getNameBook().equals(nameFilter)) {
                System.out.println(buff.getNameBook());
            }
        }
    }

    static public void main(String[] args) {
        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("Electronics", 2000);
        Book book3 = new Book("Mechanics", 1000);
        Book book4 = new Book("Programming", 2000);
        Book[] library = new Book[4];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        printLibrary(library);
        Book buffer;
        buffer = library[0];
        library[0] = library[3];
        library[3] = buffer;
        printLibrary(library);
        prtFilterLib(library, "Clean code");
    }
}
