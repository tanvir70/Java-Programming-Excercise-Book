package book.StringJavaMathAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();

        reverse(string);
    }

    public static void reverse(String string) {

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
