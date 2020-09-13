package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.print("Enter the value of integer a :  ");
        a = in.nextInt();
        int b;
        System.out.print("Enter the value of integer b : ");
        b = in.nextInt();
        int sum;
        sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);



    }
}
