package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        double doubleNumber;
        System.out.println("Enter any decimal number: ");
        doubleNumber = keyboardInput.nextDouble();
        System.out.println("You entered the number: " + doubleNumber);
    }
}
