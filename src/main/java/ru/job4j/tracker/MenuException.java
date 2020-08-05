package ru.job4j.tracker;

public class MenuException extends Exception {
    public void replay(Output pOut) {
        pOut.printLn("Not found item !");
    }
}
