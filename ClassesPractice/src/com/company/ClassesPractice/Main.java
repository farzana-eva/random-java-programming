package com.company.ClassesPractice;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }
        System.out.println("Average result = " + MathEquation.getAverageResult());
    }

    System.out.println();
    System.out.println("using execute overloads");
    System.out.println();
    MathEquation equationOverload = new MathEquation(opCode: 'd');
    double leftDouble = 9.0d;
    double rightDouble = 4.0d;

    equationOverLoad.execute(leftDouble, rightDouble);
    System.out.println("Overload result with doubles: " + equationOverLoad.getResult());


}




















