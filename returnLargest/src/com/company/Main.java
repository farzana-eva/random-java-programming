package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Given three int values, a, b, c, return the largest.
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println("please enter the first integer number: ");
        a = input.nextInt();

        System.out.println("please enter the second integer number: ");
        b = input.nextInt();

        System.out.println("please enter the third integer number: ");
        c = input.nextInt();

        int  ans = intMax(a, b, c);
        System.out.println("Among integers " + a + ", " + b + ", and " + c
                + " the largest integer is : " + ans);

    }

    public static int intMax(int a, int b, int c){
        int max;
        if(a > b){
            max = a;
        }
        else {
            max = b;
        }

        if(c > max) {
            max = c;
        }
            return max;
        }
    }

