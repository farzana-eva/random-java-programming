package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	/*Given 3 int values, a b c, return their sum. However, if one of the values is 13
	then it does not count towards the sum and values to its right do not count. So for example,
	if b is 13, then both b and c do not count. */

	    int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = input.nextInt();
        System.out.println("Enter the value of b: ");
        b = input.nextInt();
        System.out.println("Enter the value of c: ");
        c = input.nextInt();
        int answer;

       answer =  luckySum(a,b,c);
        System.out.println(answer);
    }



    public static int luckySum(int a, int b, int c) {

        if(a == 13)
            return 0;
        if(b == 13)
            return a;
        if(c == 13)
            return (a + b);
        return (a + b + c);
    }
}
