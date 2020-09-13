package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	2 4 8 6
	3 2 5 1
	1 8 7 9
	 */

	int array[][] = new int[3][4];

	    array[0][0] = 2;
        array[0][1] = 4;
        array[0][2] = 8;
        array[0][3] = 6;

        array[1][0] = 3;
        array[1][1] = 2;
        array[1][2] = 5;
        array[1][3] = 1;

        array[2][0] = 1;
        array[2][1] = 8;
        array[2][2] = 7;
        array[2][3] = 9;

        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2] + " " + array[0][3]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2] + " " + array[1][3]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2] + " " + array[2][3]);
    }
}
