package book.StringJavaMathAPI;

import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();

        String newString = string.substring(0,2);
        String newString2 = string.substring(string.length() - 2);

        boolean result = true;

        if ( newString.equals(newString2)){
            System.out.println(result);
        }else {
            result = false;
            System.out.println(result);
        }

    }
}
