package com.company;

public class Main {

    public static void main(String[] args)
        throws java.io.IOException{

	char input;
        System.out.print("Enter a single character from keyboard, then press ENTER: ");
        input = (char)System.in.read();
        System.out.println("The character you typed was: " + input);

    }
}