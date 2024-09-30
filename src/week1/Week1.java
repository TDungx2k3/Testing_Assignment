package week1;

import java.util.Scanner;

public class Week1 {

  public static final int BASIC_SHIP_COST = 8000;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nEnter distance (km): ");
    int distance = scanner.nextInt();

    System.out.print("Enter weight (kg): ");
    int weight = scanner.nextInt();

    long money = calculateShippingCost(weight, distance);
    if (money != -1) {
      System.out.println("Money: " + money + " vnd.");
    }

  }

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
