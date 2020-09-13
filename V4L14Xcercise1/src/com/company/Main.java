package com.company;

public class Main {

    public static void main(String[] args) {
	String phrase1[] = {"popeye", "the", "sailor", "man."};
        System.out.println();
        System.out.println(phrase1[0] + " " + phrase1[1] + " " + phrase1[2] + " " + phrase1[3]);
	String phrase2[] = new String[5];

	    phrase2[0] = "Here";
        phrase2[1] = "I";
        phrase2[2] = "Come";
        phrase2[3] = "To Save";
        phrase2[4] = "The Day!";

        System.out.println("\n" + phrase2[0] + " " + phrase2[1] + " " + phrase2[2] + " "
                + phrase2[3] + " " + phrase2[4]);
    }
}
