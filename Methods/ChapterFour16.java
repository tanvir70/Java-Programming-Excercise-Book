package book;

import java.util.Scanner;

public class ChapterFour16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter another number: ");
        int b = sc.nextInt();


        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        int result = switch (operation) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };

        System.out.println("result = " + result);
    }
}
