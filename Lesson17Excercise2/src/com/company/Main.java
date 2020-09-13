package com.company;

public class Main {

    public static void main(String[] args) {
	int inches, counter = 0;
	double feet;

	for(inches = 1; inches <= 20; inches++){
	    feet = inches / 12.0;
        System.out.println(inches + " inches is equal to " + feet + " feet.");
        counter++;
        if(counter == 3){
            System.out.println();
            counter = 0;
        }
    }

    }
}
