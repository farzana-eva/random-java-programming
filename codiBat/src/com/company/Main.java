package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean weekday = true;
        boolean vacation = false;
        System.out.println(sleepIn(weekday, vacation));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation)
            return true;
        else return false;

    }
}
