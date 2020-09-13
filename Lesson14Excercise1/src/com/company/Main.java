package com.company;


  /*
    Write a program to convert 34.0 degree Celcius to Farenheit, then print the result
    on the screen.
    The equation for the conversion is:
    Farenheit = (9 / 5) * Celcius + 32
     */
public class Main {

    public static void main(String[] args) {
	double celcius;
	double farenheit;
	celcius = 34.0;
	farenheit = (9.0 / 5.0) * celcius + 32;
        System.out.println(celcius + " degree celcius is equal to " + farenheit
        + " farenheit.");
    }
}
