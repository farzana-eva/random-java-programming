package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number from 1 to 4: ");
        number = input.nextInt();
        if(number == 1) printSpring();
        if(number == 2) printSummer();
        if(number == 3) printFall();
        if(number == 4) printWinter();
    }
    public static void printSpring(){
        System.out.println("The season is Spring, and flowers are blooming!");
    }
    public static void printSummer(){
        System.out.println("The season is Summer, and it is getting hot!");
    }
    public static void printFall(){
        System.out.println("The season is Fall, and leaves are falling!");
    }
    public static void printWinter(){
        System.out.println("The season is Winter, and it is snowing!");
    }
}
