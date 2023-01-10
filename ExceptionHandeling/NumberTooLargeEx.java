package book.ExceptionHandeling;

import java.util.Scanner;

public class NumberTooLargeEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();

        try {
            if (number > 100) {
                throw new NumberTooLargeException("Number is larger than 100. Please enter below 100.");
            }else {
                System.out.println("Number is okay.");
            }
        } catch (NumberTooLargeException e) {
            e.printStackTrace();
        }
    }
}

class NumberTooLargeException extends Exception {
    public NumberTooLargeException(String message) {
        super(message);
    }
}