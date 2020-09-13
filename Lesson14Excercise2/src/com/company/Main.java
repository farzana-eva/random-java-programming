package com.company;
/*
   Write a program to convert 10.5 feet and convert it to meters.
   There are 0.305 meters per foot.
 */
public class Main {

    public static void main(String[] args) {
	double feet;
	double meters;
	feet = 10.5;
	meters = feet * 0.305;
        System.out.println( feet + " Feet is equal to " + meters + " Meters." );
    }
}
