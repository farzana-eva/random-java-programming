package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string: ");
        str = input.nextLine();
        str = str.toUpperCase();
        System.out.println("\n" + str);

    }
}
