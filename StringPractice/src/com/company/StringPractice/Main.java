package com.company.StringPractice;


public class Main {

    public static void main(String[] args) {


        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        flight2.add1Passenger();
        System.out.println(flight2.passengers);

        flight2 = flight1;

        System.out.println(flight2.passengers);
        flight1.add1Passenger();
        flight1.add1Passenger();
        System.out.println(flight2.passengers);
    }
}
