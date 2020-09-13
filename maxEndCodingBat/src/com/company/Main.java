package com.company;
/*
Given an array of ints length 3, figure out which is larger, the first or last element
 in the array, and set all the other elements to be that value. Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */

public class Main {

    public static void main(String[] args) {
	int array[] = {11, 5, 9};
	int maxEnd[] = new int[3];
	maxEnd[0] = array[0];

	if(array[2] >= maxEnd[0])
        maxEnd[0] = array[2];
        maxEnd[1] = maxEnd[0];
        maxEnd[2] = maxEnd[0];

        System.out.println(maxEnd[0] + ", " + maxEnd[1] + ", " + maxEnd[2]);
    }
}

