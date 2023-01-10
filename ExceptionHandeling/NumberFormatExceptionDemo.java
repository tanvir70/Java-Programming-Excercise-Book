package book.ExceptionHandeling;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();
            try {
                int n = Integer.parseInt(input);
                System.out.println("You entered: " + n);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
