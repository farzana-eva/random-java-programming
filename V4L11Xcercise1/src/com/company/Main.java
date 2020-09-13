package com.company;

public class Main {

    public static void main(String[] args) {
	String first = "apple pie";
	String second = "zebras";
	String third = "bubble gum";
	String fourth = "Fish Sticks";

        System.out.println("\n" + first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println();

        if(first.compareTo(second) > 0) System.out.println("first greater than 2nd");
        if(first.compareTo(second) < 0) System.out.println("first less than 2nd");
        if(first.compareTo(second) == 0) System.out.println("first same as 2nd");
    }
}
