package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        double length = 0, width = 0;
        double perimeter = 0, area = 0;

        System.out.println("Enter the length of the rectangle: ");
        if(keyboardInput.hasNextDouble()) length = keyboardInput.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        if(keyboardInput.hasNextDouble()) width = keyboardInput.nextDouble();

        perimeter = length + length + width + width;
             area = length * width;

        System.out.println("\nThe perimeter of this rectangle is: " + perimeter);
        System.out.println("The area of this rectangle is: " + area);

    }
}
