package ru.job4j.oop;

public class Cat {
    private String food;
    private String nick;

    public void show() {
        System.out.println("There are " + nick + "'s food.");
        System.out.println(food);
    }

    public void eat(String pMeat) {
        food = pMeat;
    }

    public void giveNick(String pNick) {
        nick = pNick;
    }

    public static void main(String[] args) {

    }
}
