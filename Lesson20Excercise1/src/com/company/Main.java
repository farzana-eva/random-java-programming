package com.company;

public class Main {

    public static void main(String[] args) {
        char upperCase;
        char lowerCase;


        upperCase = 'A';
        lowerCase = 'a';
        int counter;

        for(counter = 1; counter <= 26; counter++){
            System.out.println(upperCase + "\t" + lowerCase);
            upperCase++;
            lowerCase++;
        }
    }
}
