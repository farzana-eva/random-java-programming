package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "Humpty Dumpty Sat On The Wall.";
        System.out.println();
	char array[] = new char[30];
	str.getChars(0, 30, array,0);
        System.out.println(array);
        System.out.println();
        for(int i = 29; i >= 0; i--){
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
