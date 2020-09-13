package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int myAge = 34;
        int ageGuess = 0;
        System.out.println("Guess my age and enter: ");
        if(keyboardInput.hasNextInt() == true)
            ageGuess = keyboardInput.nextInt();
        if (ageGuess == myAge)
        {
            System.out.println("Your guess: " + ageGuess);
            System.out.println("You are correct!");
        }
        else
            {
            System.out.println("Your guess: " + ageGuess);
            System.out.println("You are wrong!");
        }
    }
}
