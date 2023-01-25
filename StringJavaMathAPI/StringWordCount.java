package book.StringJavaMathAPI;

import java.util.StringTokenizer;

public class StringWordCount {
    public static int countWords(String string) {

        String[] words = string.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        return count;
    }

    public static int countWords2(String string) {
        int count = 0;
        StringTokenizer tk = new StringTokenizer(string);
        while (tk.hasMoreTokens()){
            tk.nextToken();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String string = "the quick brown fox";
        int count = countWords(string);
        System.out.println(count);
        System.out.println(countWords2(string));
    }
}
