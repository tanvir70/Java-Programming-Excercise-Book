package book.StringJavaMathAPI;

public class ContainsSubstring {
    public static void main(String[] args) {

        String string = "This is an example string";
        String substring = "is";
        boolean result = containsSubstring(string, substring);
        System.out.println(result);
    }

    public static boolean containsSubstring(String string, String substring) {
        return string.contains(substring);
    }
}