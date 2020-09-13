package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 1;
        System.out.println("Enter any number from 1 to 12: ");
        if(input.hasNextInt() == true) month = input.nextInt();

        switch (month){
            case 1:
                System.out.println("January is my favorite month!");
                break;
            case 2:
                System.out.println("February is my favorite month!");
                break;
            case 3:
                System.out.println("March is my favorite month!");
                break;
            case 4:
                System.out.println("April is my favorite month!");
                break;
            case 5:
                System.out.println("May is my favorite month!");
                break;
            case 6:
                System.out.println("June is my favorite month!");
                break;
            case 7:
                System.out.println("July is my favorite month!");
                break;
            case 8:
                System.out.println("August is my favorite month!");
                break;
            case 9:
                System.out.println("September is my favorite month!");
                break;
            case 10:
                System.out.println("October is my favorite month!");
                break;
            case 11:
                System.out.println("November is my favorite month!");
                break;
            case 12:
                System.out.println("December is my favorite month!");
                break;
            default:
                System.out.println("You entered an invalid entry!");
        }
    }
}
