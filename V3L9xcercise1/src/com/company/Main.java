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
        System.out.println("Houston target: $1050 of apple sales.,  ");
        System.out.println("Need to sell " + houstonStore.appleRevenueTarget(1050) + " apples");

        seattleStore.numberOfApplesInYear = 765;
        seattleStore.getPricePerApples = 0.86;
        seattleStore.getNumberOfOrangesInYear = 842;
        seattleStore.getPricePerOrange = 0.91;
        System.out.println("\nSeattle target: $620 of oranges sales.,  ");
        System.out.println("Need to sell " + seattleStore.orangeRevenueTarget(620) + " oranges");

        orlandoStore.numberOfApplesInYear = 402;
        orlandoStore.getPricePerApples = 0.77;
        orlandoStore.getNumberOfOrangesInYear = 398;
        orlandoStore.getPricePerOrange = 0.79;
        System.out.println("\n Orlando target: $744 of apple sales.,  ");
        System.out.println("Need to sell " + orlandoStore.appleRevenueTarget(744) + " apples");


    }
}
class groceryStore{
    int numberOfApplesInYear;
    double getPricePerApples;
    int getNumberOfOrangesInYear;
    double getPricePerOrange;

    double grossRevenue() {
        double revenue;

        revenue = (numberOfApplesInYear * getPricePerApples) + (getNumberOfOrangesInYear * getPricePerOrange);
        return revenue;
    }
    double appleRevenueTarget(double revenue){
        return revenue / getPricePerApples;

    }
    double orangeRevenueTarget(double revenue){
        return revenue / getPricePerOrange;

    }
}


