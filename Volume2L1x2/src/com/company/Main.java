package com.company;

public class Main {

    public static void main(String[] args)
        throws java.io.IOException {
        char input;

        System.out.println("I'm thinking a letter between A and Z.");
        System.out.println("Guess my letter: ");


        input = (char) System.in.read();
	if((input == 'W') || (input == 'w')) {
        System.out.printf("Correct!");
    }

        if((input != 'W') && (input != 'w'))
        System.out.println("Nope, not Correct!");
    }
}
