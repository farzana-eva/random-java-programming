package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of integer n :  ");
        n = in.nextInt();
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)){

            System.out.println("true");
        }
         else
            System.out.println("false");

        }
    }

