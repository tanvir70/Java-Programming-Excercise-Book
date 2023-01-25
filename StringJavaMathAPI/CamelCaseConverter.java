package book.StringJavaMathAPI;

public class CamelCaseConverter {
    public static String camelCase(String string) {

        String[] words = string.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String string = "the quick brown fox";
        String camelCase = camelCase(string);
        System.out.println("Original string: '" + string + "'");
        System.out.println("Title case string: '" + camelCase + "'");
    }
}
