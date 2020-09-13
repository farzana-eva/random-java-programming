package com.company;

public class Main {

    public static void main(String[] args) {
	String password = "apples";
	String passwordTypedIn = "APPLES";

	String passwordMatch = passwordTypedIn.toLowerCase();
		System.out.println(passwordMatch);

	if(passwordMatch.equals(password) == true) System.out.println("password accepted");
	else System.out.println("invalid password");
    }
}
