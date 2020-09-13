package com.company;

public class Main {

    public static void main(String[] args) {
	String phrase = "jason went to washington dc.";

        System.out.println(phrase);
        phrase = phrase.replace("j", "J");
        phrase = phrase.replace("w", "W");
        phrase = phrase.replace("dc", "DC");
        //System.out.println();
        System.out.println(phrase);
    }
}
