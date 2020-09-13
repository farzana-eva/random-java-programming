package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
	int grade;
        System.out.println("Enter the number you gain on the exam: ");
        grade = keyboardInput.nextInt();
	if(grade >= 90)
        System.out.println("You earned an A on the exam");
	else if(grade >= 80 && grade < 90)
            System.out.println("You earned a B on the exam");
        else if(grade >= 70 && grade < 80)
        System.out.println("You earned a C on the exam");
    else if(grade >= 60 && grade < 70)
        System.out.println("You earned a D on the exam");
    else
        System.out.println("You earned an F on the exam");

    }
}
