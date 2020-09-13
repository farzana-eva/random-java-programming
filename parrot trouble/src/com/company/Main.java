package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
       int hour = 8;
       boolean isTalking = true;
       boolean isParrotTrouble = ((hour < 7 || hour > 20) && isTalking);
        System.out.println(isParrotTrouble);



        }
    }