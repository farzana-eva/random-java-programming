package com.company;

public class Main {

    public static void main(String[] args) {
	boolean isWeekday = false;
	boolean isVacation = true;
	boolean isSleepIn = (!isWeekday || isVacation);
        System.out.println(isSleepIn);
    }
}
