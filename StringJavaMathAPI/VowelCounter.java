package book.StringJavaMathAPI;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();

        System.out.println(vowelsCount(string));
    }
    public static  int vowelsCount(String string){
        String vowels = "aeiouAEIOU";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (vowels.indexOf(string.charAt(i)) == -1 ){
                count++;
            }
        }
        return string.length() - count;
    }
}

