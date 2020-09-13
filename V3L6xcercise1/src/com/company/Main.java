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
        revenueHouston = (houstonStore.numberOfApplesInYear * houstonStore.getPricePerApples) +
                (houstonStore.getNumberOfOrangesInYear * houstonStore.getPricePerOrange);
        System.out.println("The revenue of the Houston store is: $" + revenueHouston);

        seattleStore.numberOfApplesInYear = 765;
        seattleStore.getPricePerApples = 0.86;
        seattleStore.getNumberOfOrangesInYear = 842;
        seattleStore.getPricePerOrange = 0.91;
        revenueSeattle = (seattleStore.numberOfApplesInYear * seattleStore.getPricePerApples) +
                (seattleStore.getNumberOfOrangesInYear * seattleStore.getPricePerOrange);
        System.out.println("The revenue of the Seattle store is: $" + revenueSeattle);

        orlandoStore.numberOfApplesInYear = 402;
        orlandoStore.getPricePerApples = 0.77;
        orlandoStore.getNumberOfOrangesInYear = 398;
        orlandoStore.getPricePerOrange = 0.79;
        revenueOrlando = (orlandoStore.numberOfApplesInYear * orlandoStore.getPricePerApples) +
                (orlandoStore.getNumberOfOrangesInYear * orlandoStore.getPricePerOrange);
        System.out.println("The revenue of the Orlando store is: $" + revenueOrlando);
        double totalRvenue;
        totalRvenue = revenueHouston + revenueSeattle + revenueOrlando;
        System.out.println("Total revenue is: $" + totalRvenue);


    }
}
class groceryStore{
    int numberOfApplesInYear;
    double getPricePerApples;
    int getNumberOfOrangesInYear;
    double getPricePerOrange;
}
