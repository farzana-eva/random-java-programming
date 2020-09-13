package com.company;

public class Main {

    public static void main(String[] args) {
        groceryStore houstonStore = new groceryStore(534, 0.99, 429, 0.87);
        groceryStore seattleStore = new groceryStore(765, 0.86, 842, 0.91);
        groceryStore orlandoStore = new groceryStore(402, 0.77, 398, 0.79);

        System.out.println("For Houston store:gross revenue $ "+ houstonStore.grossRevenue());
        System.out.println("For Seattle store: gross revenue $ " + seattleStore.grossRevenue());
        System.out.println("For Orlando store: gross revenue $ " +  orlandoStore.grossRevenue());

        System.out.println("\nApple revenue target for Houston store: " + houstonStore.appleRevenueTarget(1000));
        System.out.println("Apple revenue target for Seattle store: " + seattleStore.appleRevenueTarget(1000));
        System.out.println("Apple revenue target for Orlando store: " + orlandoStore.appleRevenueTarget(1000));

        System.out.println("\nOrange revenue target for Houston store: " + houstonStore.orangeRevenueTarget(800));
        System.out.println("Orange revenue target for Seattle store: " + seattleStore.orangeRevenueTarget(800));
        System.out.println("Orange revenue target for Orlando store: " + orlandoStore.orangeRevenueTarget(800));
    }
}
class groceryStore{
    int numberOfApplesInYear;
    double getPricePerApples;
    int getNumberOfOrangesInYear;
    double getPricePerOrange;

    groceryStore(int aoy, double ppa, int ooy, double ppo){
        numberOfApplesInYear = aoy;
        getPricePerApples = ppa;
        getNumberOfOrangesInYear = ooy;
        getPricePerOrange = ppo;
    }
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



