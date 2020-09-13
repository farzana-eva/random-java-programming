package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int monthRevenue[][] = new int[12][2];

        monthRevenue[0][0] = 1;
        monthRevenue[0][1] = 34;

        monthRevenue[1][0] = 2;
        monthRevenue[1][1] = 44;

        monthRevenue[2][0] = 3;
        monthRevenue[2][1] = 23;

        monthRevenue[3][0] = 4;
        monthRevenue[3][1] = 76;

        monthRevenue[4][0] = 5;
        monthRevenue[4][1] = 65;

        monthRevenue[5][0] = 6;
        monthRevenue[5][1] = 98;

        monthRevenue[6][0] = 7;
        monthRevenue[6][1] = 123;

        monthRevenue[7][0] = 8;
        monthRevenue[7][1] = 102;

        monthRevenue[8][0] = 9;
        monthRevenue[8][1] = 87;

        monthRevenue[9][0] = 10;
        monthRevenue[9][1] = 43;

        monthRevenue[10][0] = 11;
        monthRevenue[10][1] = 34;

        monthRevenue[11][0] = 12;
        monthRevenue[11][1] = 12;

        for(int i = 0; i <= 11; i++){

            System.out.println("For month number " + monthRevenue[i][0] + ", revenue was: $" +
                    monthRevenue[i][1]);
        }
    }
}
