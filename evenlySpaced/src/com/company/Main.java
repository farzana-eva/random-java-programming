package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Given three ints, a b c, one of them is small, one is medium and one is large.
         Return true if the three values are evenly spaced, so the difference between
         small and medium is the same as the difference between medium and large.

        evenlySpaced(2, 4, 6) → true
        evenlySpaced(4, 6, 2) → true
        evenlySpaced(4, 6, 3) → false */

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

        boolean  ans = evenlySpaced(a, b, c);
        System.out.println("The three integers " + a + ", " + b + ", and " + c
                + " are evenly spaced : " + ans);

    }

    public static boolean evenlySpaced(int a, int b, int c){
        if ((a > b && b > c) && ((a - b) == (b - c))) {
            return true;
        }

        if ((c > b && b > a) && ((c - b) == (b - a))) {
            return true;
        }
        if ((b > a && a > c) && ((b - a) == (a - c))) {
            return true;
        }
        if ((a > c && c > b) && ((a - c) == (c - b))) {
            return true;
        }
        if ((c > a && a > b) && ((c - a) == (a - b))) {
            return true;
        }

        if ((a == b && b == c)) {
            return true;
        }

        else return false;
    }
}



