package com.company;

public class Main {

    public static void main(String[] args) {
	int num;
        System.out.println("num \t a = num  " +
                "+ 2 \t b = num - 2 \t c = num * 2 \t d = num / 2 ");
	for(num = 1; num <= 15; num++){
	    int a = num, b = num, c = num;
	    double d = num;
	    a += 2;
	    b -= 2;
	    c *= 2;
	    d /= 2;
        System.out.println(num + "\t\t\t\t" + a + "\t\t\t\t" + b + " \t\t\t\t" + c +
                "\t\t\t\t" + d);
    }
    }
}
