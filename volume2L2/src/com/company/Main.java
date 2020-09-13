package com.company;

public class Main {

    public static void main(String[] args)
        throws java.io.IOException {

        char input;
        int input1;


        System.out.println("pres key from keyboard then press ENTER: ");
        input = (char) System.in.read();
        System.out.println("You entered the key " + input);

        input1 = System.in.read();
        System.out.println("the invisible key is: " + input1);

        System.out.println("\n pres key from keyboard then press ENTER: ");
        input = (char) System.in.read();
        System.out.println("You entered the 2nd key " + input);
    }
}
