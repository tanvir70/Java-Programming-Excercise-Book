package book.StringJavaMathAPI;

public class SnackCaseConverter {
    public static String toSnakeCase(String string) {

        String[] words = string.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word.toLowerCase());
            if (!word.equals(words[words.length - 1])) {
                sb.append("_");
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String string = "The quick brown fox";
        String snakeCase = toSnakeCase(string);
        System.out.println("Original string: '" + string + "'");
        System.out.println("Snake case string: '" + snakeCase + "'");

    }
}