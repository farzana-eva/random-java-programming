package com.company;

public class Main {

    public static void main(String[] args) {
	String str1 = "living zebras";
	String str2 = "juicy oranges";
	String str3 = "do the victory dance";
	String str4 = "task of an elephant";

        System.out.println( "\n" +str1 + "\n" + str2 + "\n" +str3 + "\n" +str4);
		System.out.println();

		System.out.println(str1.indexOf("zebras"));
		System.out.println(str2.indexOf("or"));
		System.out.println(str3.indexOf("dan"));
		System.out.println(str4.indexOf("of an"));

    }
}
