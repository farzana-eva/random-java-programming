package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        double grade1, grade2, grade3;
        double gradeAverage;
        System.out.println("Enter any numbers from 0 to 100: ");
        grade1 = keyboardInput.nextDouble();
        System.out.println("Enter any numbers from 0 to 100: ");
        grade2 = keyboardInput.nextDouble();
        System.out.println("Enter any numbers from 0 to 100: ");
        grade3 = keyboardInput.nextDouble();
        System.out.println("You entered grades " + grade1 + ", " + grade2 + ", " + grade3);
        gradeAverage = averageGrades(grade1, grade2, grade3);
        System.out.println("The average of the three grades are: " + gradeAverage);

    }

    public static double averageGrades(double i, double j, double k){
        return (i + j + k) / 3;

    }
}
