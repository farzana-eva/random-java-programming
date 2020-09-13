package com.company;

public class Main {

    public static void main(String[] args) {
	int num1 = 10;
	int num2 = 10;
	int answer1;
	int answer2;
	boolean answer3;
	answer1 = numAddition(num1, num2);
        System.out.println("addition: " + answer1);
	answer2 = numMultiplication(num1) ;
        System.out.println("multiplication: " + answer2);
        answer3 = equalNumber(num1, num2);
        System.out.println(answer3);
    }
    public static int numAddition(int a, int b){
        return (a + b);
    }
    public static int numMultiplication(int a){
        return (a * 8);
    }
    public static boolean equalNumber(int r, int s){
        if(r == s)
            return true;
        else return false;
    }
}
