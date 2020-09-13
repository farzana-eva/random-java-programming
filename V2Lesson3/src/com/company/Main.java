package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int integerNumber;
        double doubleNumber;

        System.out.println("Enter any integer: ");
        integerNumber = keyboardInput.nextInt();
        System.out.println("You entered the number: " + integerNumber);

        System.out.println("\n\nEnter any decimal number (double): ");

        doubleNumber = keyboardInput.nextDouble();
        System.out.println("You entered the number: " + doubleNumber);

    }
}
