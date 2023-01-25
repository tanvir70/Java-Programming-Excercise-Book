package book.StringJavaMathAPI;

public class TitleCaseConverter {
    public static String toTitleCase(String string) {

        String[] words = string.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            // Capitalize the first letter of the word
            sb.append(Character.toUpperCase(word.charAt(0)));
            // Append the rest of the word
            sb.append(word.substring(1).toLowerCase());
            // Append a space after each word
            sb.append(" ");
        }

        // Return the modified string
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String string = "the quick brown fox";
        String titleCase = toTitleCase(string);
        System.out.println("Original string: '" + string + "'");
        System.out.println("Title case string: '" + titleCase + "'");
    }

}
