package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);

        }
        while (!input.equals("quit"));
    }
}
