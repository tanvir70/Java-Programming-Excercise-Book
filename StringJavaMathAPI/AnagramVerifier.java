package book.StringJavaMathAPI;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramVerifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();
        String string2 = scan.nextLine();

        if ( isAnagram(string,string2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String string, String string2) {
        if (string.length() != string2.length()) {
            return false;
        }

        string = string.toLowerCase();
        string2 = string2.toLowerCase();

        char[] char1 = string.toCharArray();
        char[] char2 = string2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

}
