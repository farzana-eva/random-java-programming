package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

       // int integerNumber = 0;
        double doubleNumber = 0;

        System.out.println("Enter any decimal: ");
        if(keyboardInput.hasNextDouble() == true)
        doubleNumber = keyboardInput.nextDouble();

        System.out.println("You enter the number " + doubleNumber);
    }
}
