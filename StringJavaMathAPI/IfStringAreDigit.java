package book.StringJavaMathAPI;

import java.util.Scanner;

public class IfStringAreDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();

        boolean result = checkDigit(string);
        System.out.println(result);
    }
        public static boolean checkDigit (String string){
            for (int i = 0; i < string.length(); i++) {
                if (Character.isDigit(string.charAt(i))) {
                    return true;
            }
        }
            return false;
    }
}