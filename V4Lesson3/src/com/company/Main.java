package com.company;

public class Main {

    public static void main(String[] args) {
	int largeArray[] = {8, 23, 4, 27, 78, 65, 43, 35, 5, 67, 12, 15, 1, 11}; //14 elements.

        int smallest = largeArray[0];
        int largest = largeArray[0];
        int i;

        for(i = 0; i <= 13; i++){
            if (largeArray[i] < smallest) smallest = largeArray[i];
            if (largeArray[i] > largest) largest = largeArray[i];
        }
        System.out.println("The smallest value in the Array is: " + smallest);
        System.out.println("The largest value in the Array is: " + largest);
    }
}
