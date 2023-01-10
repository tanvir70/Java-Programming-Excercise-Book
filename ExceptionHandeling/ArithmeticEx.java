package book.ExceptionHandeling;

import java.util.Scanner;

public class ArithmeticEx {

    public void divide(int a, int b) {
        System.out.println("Division : " + (a / b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integer :");

        int a = scan.nextInt();
        int b = scan.nextInt();
        ArithmeticEx sc = new ArithmeticEx();
        try {
            sc.divide(a, b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}

