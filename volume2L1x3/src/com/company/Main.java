package com.company;

public class Main {

    public static void main(String[] args)
        throws java.io.IOException {
	char lowerCase, upperCase;
        System.out.println("Type in any LOWERCASE letter: ");
        lowerCase = (char)System.in.read();
        System.out.println("You typed in the letter: " + lowerCase);

        upperCase = (char)(lowerCase - 32);
        System.out.println("The uppercase version is: " + upperCase);

    }
}
