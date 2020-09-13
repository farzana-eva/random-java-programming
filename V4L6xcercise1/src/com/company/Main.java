package com.company;

public class Main {

    public static void main(String[] args) {
	int array[] = {12, 43, 54, 2, 7, 33, 65, 4, 76, 1, 99};
	int max = array[0];
	int min = array[0];
	for(int element : array){
	    if(max < element) max = element;
	    if(min > element) min = element;
    }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
