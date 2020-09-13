package com.company;

public class Main {

    public static void main(String[] args) {
	int number = 1;
	int sum = 0;
	while(number <= 100)
	{
	    sum = sum + number;
	    number++;
    }
        System.out.println("The sum of all numbers from 1 to 100 is: " + sum);
    }
}
