package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    static public void main(String[] args) {
        Jukebox object1 = new Jukebox();
        object1.music(1);
        object1.music(2);
        object1.music(3);
    }
}
