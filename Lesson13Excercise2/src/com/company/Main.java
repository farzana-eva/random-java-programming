package com.company;

public class Main {
    /*
    A rectangular has dimensions 23 ft x 12 ft. write a
    program to calculate the area of the wall and display the
    result as:

    The area of the wall is < calculated answer > square feet.
     */
    public static void main(String[] args) {
	int length;
	int height;
	length = 23;
	height = 12;
	int area;
	area = length * height;
        System.out.println("The area of the wall is " + area + " square feet.");
    }
}
