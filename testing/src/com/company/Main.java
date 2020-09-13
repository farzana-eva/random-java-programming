package com.company;

public class Main {

    public static void main(String[] args) {
        int num1 = 18;
        int answer;
        answer = addingNumber(num1);
        System.out.println("\nThe result is " + answer);


    }

    public static int addingNumber(int a){
        int ans = a + 10;
        return ans;
    }
}
