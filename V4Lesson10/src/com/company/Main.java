package com.company;

public class Main {

    public static void main(String[] args) {
	String fullName = "Farzana Eva";
	String userInput = "Farzana Eva";

        System.out.println(fullName + "\n" + userInput);
        System.out.println();

        System.out.println("Are these strings equal?" + userInput.equals(fullName));

        System.out.println();
        System.out.println(fullName.equals("I love pizzas."));
    }
}
