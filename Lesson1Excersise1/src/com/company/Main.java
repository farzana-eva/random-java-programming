package com.company;

public class Main {

    public static void main(String[] args)
        throws java.io.IOException {

	char input;
        System.out.println("The capital of the United States is Washington, DC? (Answer T or F): ");

        input = (char)System.in.read();
        if (input == 'T') System.out.println("Correct!");
        if (input == 'F') System.out.println("Incorrect!");
    }
}
