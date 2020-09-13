package com.company;

public class Main {

    public static void main(String[] args)
    throws java.io.IOException {
	char input;
	int i;
	char letterTest = 'A';

        System.out.println("Enter your favorite CAPITAL letter of the alphabet: ");
        input = (char) System.in.read();

        for(i = 1; i <= 26; i++)
        {
            if(input == letterTest)
                break;
            letterTest++;
        }
        System.out.println("Your favorite letter is " + input + ", which is letter " + i);
    }
}
