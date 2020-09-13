package com.company;

public class Main {
/*
A back yard has dimensions along its border of 20, 18, 17, 24 feet.
Write a program that stores these length in variables and calculates
the perimeter around the border of the yard. Display the output as:

The perimeter of the yard is <calculated answer> feet.
 */
    public static void main(String[] args) {
	int side1, side2, side3, side4;
	side1 = 20;
	side2 = 18;
	side3 = 17;
	side4 = 24;

	int perimeter;

	perimeter = side1 + side2 + side3 + side4;
        System.out.println("The perimeter of the yard is " + perimeter + " feet.");
    }
}
