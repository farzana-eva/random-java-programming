package com.company;

public class Main {

    public static void main(String[] args) {
	String first = "Lou, Lou, skip to my Lou";
	String second = "Lou, Lou, skip to my Lou";
	String third = "lou, lou, skip to my lou";
	String four = "Skip to my Lou, my darling!";

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(four);

        System.out.println(" \nAre string first and second is equal? " + first.equals(second));
        System.out.println("Are string 1 and 3 is equal? " + first.equals(third));
		System.out.println("Are string 1 and 4 is equal? " + first.equals(four));
    }
}
