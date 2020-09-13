package com.company;

public class Main {
/*
The java Math class contains a method called pow(x,y).This method takes the number "x"
and raises it to be the power "y". x and y are double floating point numbers, and the
method returns a double floating point number as the answer

Write a program that computes the following:
1.25 ^1
1.25 ^2
1.25 ^3 And so on....
Format the output as:

1.25 raised to the power of <power> is equal to <answer>.
Increment the exponent from 1 to 20.
 */
    public static void main(String[] args) {
        double x = 1.25;
        double y;
        for(y = 1; y <= 20; y++){

            double answer = Math.pow(x, y);
            System.out.println("1.25 raised to the power of "+ y
                    + " is equal to " +  answer );
    }

    }
}
