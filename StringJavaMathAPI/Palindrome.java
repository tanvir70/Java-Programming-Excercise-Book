package book.StringJavaMathAPI;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // ব্যবহারকারীর কাছ থেকে একটি শব্দ নিই
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();


        // শব্দটি একটি প্যালিনড্রোম কি না তা পরীক্ষা করি
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
