package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    static public void main(String[] args) {

        Scanner inpute = new Scanner(System.in);

        while (true) {
            System.out.println("I am the great Oracle. What do you want to know? ");
            String buff = inpute.nextLine();

            if (buff.equals("quit")) {
                break;
            } else {
                String result = "May be";
                int answer = new Random().nextInt(3);
                switch (answer) {
                    case 0:
                        result = "Yes";
                        break;
                    case 1:
                        result = "No";
                        break;
                }
                System.out.println(result);
            }
        }
    }
}
