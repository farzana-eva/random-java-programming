package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args)
       throws java.io.IOException {
        char input;
        System.out.print("The capital of the USA is Washington, DC? (Answer T or F): " );
        input = (char) System.in.read();

        if(input == 'T')
            System.out.println("Correct!");
        if(input == 'F')
            System.out.println("Incorrect!");



    }
}
