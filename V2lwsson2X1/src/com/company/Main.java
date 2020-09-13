package com.company;

public class Main {

    public static void main(String[] args)
        throws java.io.IOException{

        int rawInput, count;
        char letter;
        System.out.println("Enter any capital letter from the keyboard: ");
        rawInput = System.in.read();
        System.out.println("Letter\t ASCII value");

        for(count = rawInput; count <= 90; count++ )
        {
            letter = (char) count;
            System.out.println(letter + "\t\t " + count);
        }

    }
}
