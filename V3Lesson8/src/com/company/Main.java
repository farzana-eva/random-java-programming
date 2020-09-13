package com.company;

public class Main {

    public static void main(String[] args) {
        aircraft cessna172 = new aircraft(4, 140, 56.5, 9.5);
        aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);

        System.out.println(piperSaratoga.calculateEndurance());
        System.out.println(cessna172.calculateEndurance());
        System.out.println("\nFor cessna172 to fly for 2.5 hours, it takes " +
                cessna172.fuelNeeded(2.5) + " gallon of fuel.");
        System.out.println("\nFor Piper to fly for 5 hours, it takes " +
                piperSaratoga.fuelNeeded(5) + " gallon of fuel.");
    }
}
class aircraft{
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;
    // method to calculate aircraft endurance

    aircraft (int p, int c, double fc, double fbr){
        passengers = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;

    }
    double calculateEndurance(){
        double endurance;
        endurance = fuelCapacity / fuelBurnRate;
        return endurance;
    }
    double fuelNeeded(double time){
        return fuelBurnRate * time;

    }
}
