package com.company;

public class Main {

    public static void main(String[] args) {
        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        houstonStore.numberOfApplesInYear = 534;
        houstonStore.getPricePerApples = 0.99;
        houstonStore.getNumberOfOrangesInYear = 429;
        houstonStore.getPricePerOrange = 0.91;
        System.out.println("Houston Store" + "\n\nApples sold - " + houstonStore.numberOfApplesInYear );
        System.out.println("Apple retail price: " + houstonStore.getPricePerApples);
        System.out.println("\nOranges sold - " + houstonStore.getNumberOfOrangesInYear);
        System.out.println("Orange retail price: " + houstonStore.getPricePerOrange);

        seattleStore.numberOfApplesInYear = 765;
        seattleStore.getPricePerApples = 0.86;
        seattleStore.getNumberOfOrangesInYear = 842;
        seattleStore.getPricePerOrange = 0.91;

        orlandoStore.numberOfApplesInYear = 402;
        orlandoStore.getPricePerApples = 0.77;
        orlandoStore.getNumberOfOrangesInYear = 398;
        orlandoStore.getPricePerOrange = 0.79;

    }
}
class groceryStore{
    int numberOfApplesInYear;
    double getPricePerApples;
    int getNumberOfOrangesInYear;
    double getPricePerOrange;
}
