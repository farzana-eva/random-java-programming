package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner doubleRadius = new Scanner(System.in);
        double pi = 3.14;
        double radius = 0.0;

        System.out.println("Enter the radius of the circle: ");
        if(doubleRadius.hasNextDouble() == true)
        radius = doubleRadius.nextDouble();
        System.out.println("The radius of the circle is "+ radius + " meters.");

        double area = 0.0;
        area = pi* radius * radius;
        System.out.println("The area of the circle is " + area + " square meters.");

    }
}
