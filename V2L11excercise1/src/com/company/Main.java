package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guessNumber = 0;
        do{
            System.out.println("Guess a number between 1 to 20: ");
            if(input.hasNextInt() == true) guessNumber = input.nextInt();
            if(guessNumber < 17)
                System.out.println("INCORRECT. You guessed " + guessNumber + ". Too Low!");
            if(guessNumber > 17)
                System.out.println("INCORRECT. You guessed " + guessNumber + ". Too High!");
        }while(guessNumber != 17);
        System.out.println("You Guessed " + guessNumber + ". CORRECT!");

    }
}
