package com.company;

public class Main {

    public static void main(String[] args) {
        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        double revenueHouston, revenueSeattle, revenueOrlando;

        houstonStore.numberOfApplesInYear = 534;
        houstonStore.getPricePerApples = 0.99;
        houstonStore.getNumberOfOrangesInYear = 429;
        houstonStore.getPricePerOrange = 0.87;

        seattleStore.numberOfApplesInYear = 765;
        seattleStore.getPricePerApples = 0.86;
        seattleStore.getNumberOfOrangesInYear = 842;
        seattleStore.getPricePerOrange = 0.91;

        orlandoStore.numberOfApplesInYear = 402;
        orlandoStore.getPricePerApples = 0.77;
        orlandoStore.getNumberOfOrangesInYear = 398;
        orlandoStore.getPricePerOrange = 0.79;

        System.out.println("Houston store");
        houstonStore.grossRevenue();

        System.out.println("\nSeattle store");
        seattleStore.grossRevenue();

        System.out.println("\nOrlando store");
        orlandoStore.grossRevenue();


    }
}
class groceryStore{
    int numberOfApplesInYear;
    double getPricePerApples;
    int getNumberOfOrangesInYear;
    double getPricePerOrange;

    void grossRevenue() {
        double grossRevenue;

        grossRevenue = (numberOfApplesInYear * getPricePerApples) + (getNumberOfOrangesInYear * getPricePerOrange);
        System.out.println("The revenue of the year is: $" + grossRevenue);
    }
}
