package com.company;

public class Main {

    public static void main(String[] args) {
       boolean aSmile = false;
       boolean bSmile = false;
       boolean isMonkeyTrouble = (aSmile && bSmile) || (!aSmile && !bSmile);
        System.out.println(isMonkeyTrouble);
    }
}
