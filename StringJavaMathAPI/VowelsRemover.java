package book.StringJavaMathAPI;

import java.util.Scanner;

public class VowelsRemover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();

        System.out.println(removeVowels(string));
        System.out.println(vowelsRemove(string));
    }

    public static String removeVowels(String string){
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            boolean isVowel = false;
            for (int j = 0; j < vowels.length; j++) {
                if (string.charAt(i) == vowels[j]){
                    isVowel = true;
                    break;
                }
            }
            if ( !isVowel){
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

    // another way to solve this ...
    public static  String vowelsRemove ( String string){
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (vowels.indexOf(string.charAt(i)) == -1 ){
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

}
