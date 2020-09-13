package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = 1;
        int finalAge;
        System.out.println("Enter your current age: ");
        if(input.hasNextInt() == true)
        age = input.nextInt();
        System.out.println("You are now [current age] " + age + " years old.");
         finalAge = age + 14;
        System.out.println("In 14 years, you will be " + finalAge + " years old");

    }
}
