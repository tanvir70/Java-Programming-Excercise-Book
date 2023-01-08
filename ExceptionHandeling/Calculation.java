package book.ExceptionHandeling;

import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 0;
        while (true) {
            System.out.println("Enter two integers:");
            try {
                num1 = input.nextInt();
                num2 = input.nextInt();

            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");

            }

            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            System.out.println("Quotient: " + (num1 / num2));

        }
    }
}


