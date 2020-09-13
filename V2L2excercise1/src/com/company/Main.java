package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;
        System.out.println("Enter number1: ");
        number1 = keyboardInput.nextInt();
        System.out.println("Enter number2: ");
        number2 = keyboardInput.nextInt();
        int ans;
        ans = bigNumber(number1, number2);
        System.out.println("You entered  " + number1 + " and " + number2 );
        System.out.println("The big number is: " + ans);
    }
    public static int bigNumber(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
}
