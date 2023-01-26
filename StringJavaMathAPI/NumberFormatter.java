package book.StringJavaMathAPI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the number of digits after the decimal point: ");
        int digits = scanner.nextInt();

        DecimalFormat df = new DecimalFormat("#." + "#".repeat(digits));
        String formattedNumber = df.format(number);

        System.out.println("Formatted number: " + formattedNumber);
    }

}
