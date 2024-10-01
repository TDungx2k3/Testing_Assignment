package org.example;

public class Week1Service {
    public static final int BASIC_SHIP_COST = 8000;

    public static long calculateShippingCost(int weight, int distance) {
        if (weight < 0 || distance < 0) {
            System.out.println("Invalid input.");
            return -1;
        }
        if (weight > 10 || distance > 100) {
            System.out.println("Overload.");
            return -1;
        }
        return Math.round((weight + distance / 5.0) * BASIC_SHIP_COST);
    }
}
