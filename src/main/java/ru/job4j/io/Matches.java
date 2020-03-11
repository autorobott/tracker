package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    static public void main(String[] args) {
        Scanner inpute = new Scanner(System.in);
        int sticks = 11;
        String nameWin = "Player";
        int stepGame = 0;

        System.out.println("Hello. This is game 11");
        System.out.println("Good luck !!!");
        boolean stopGame = true;
        while (stopGame) {
            nameWin = stepGame % 2 == 0 ? "Player 1" : "Player 2";
            System.out.println(nameWin + " takes");
            System.out.println("Sticks " + sticks);
            int selects = Integer.valueOf(inpute.nextLine());
            if ((selects >= 1) && (selects <= 3)) {
                sticks -= selects;
                stepGame++;
                if (sticks <= 0) {
                    stopGame = false;
                }
            }
        }
        System.out.println(nameWin + " is Winner! ");
    }
}
