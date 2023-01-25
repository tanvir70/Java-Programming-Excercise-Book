package book.StringJavaMathAPI;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String string) {
        // Create a set of the alphabet
        // বর্ণের সেট তৈরী করি
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }


        // Convert the string to lowercase and add each character to a set
// স্ট্রিং ছোট হাতের অক্ষরে রূপান্তর করে সেটা যোগ করি
        Set<Character> charSet = new HashSet<>();
        for (char c : string.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }


        // Check if the alphabet set is a subset of the charSet
//বর্ণমালা সেটটি charSet এর একটি উপসেট কিনা তা পরীক্ষা করুন
        return charSet.containsAll(alphabet);
    }


    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog.";
        if (isPangram(string)) {
            System.out.println("'" + string + "' is a pangram.");
        } else {
            System.out.println("'" + string + "' is not a pangram.");
        }


    }

}
