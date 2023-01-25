package book;

import java.util.Scanner;

public class ChapterThree21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter available fuel in litter: ");
        int fuel = scan.nextInt();
        System.out.print("Enter fuel usage: ");
        int fuelConsumption = scan.nextInt();
        System.out.println("Enter number of passengers:");
        int passenger = scan.nextInt();

        int mileage = 0;

        mileage = fuel * fuelConsumption;

    }
}
