package book;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChapterFour26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        boolean finished = false;

        while (!finished) {
            System.out.print("Enter product price (or 0 to finish): ");
            double price = scanner.nextDouble();

            if (price == 0) {
                finished = true;
            } else {
                totalPrice += price;
            }
        }

        double vat = totalPrice * 0.15;
        double finalPrice = totalPrice + vat;

        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT (15%): " + vat);
        System.out.println("Final price: " + finalPrice);
        System.out.print("Enter the amount of money paid: ");
        double moneyPaid = scanner.nextDouble();

        DecimalFormat formatter = new DecimalFormat("#.##");
        if (moneyPaid > finalPrice) {
            double returnAmount = moneyPaid - finalPrice;
            System.out.println("Return amount: "
                    + formatter.format(returnAmount));
        } else {
            double outstandingAmount = finalPrice - moneyPaid;
            System.out.println("Outstanding amount: "
                    + formatter.format(outstandingAmount));
        }

    }
}
