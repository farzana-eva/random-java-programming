package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int guessStates = 0;
        System.out.println("How many states are in the USA?: ");
        if (keyboardInput.hasNextInt() == true) guessStates = keyboardInput.nextInt();


        if (guessStates == 50) {
            System.out.println("your guess states are " + guessStates);
            System.out.println("you are correct.");
        } else {
            System.out.println("you are incorrect.");
            if (guessStates > 50) {
                System.out.println("Your guess states are " + guessStates);
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess states are " + guessStates);
                System.out.println("Your guess is too low.");
            }
        }
    }
}
