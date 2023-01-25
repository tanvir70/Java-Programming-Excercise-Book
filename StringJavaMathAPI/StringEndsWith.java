package book.StringJavaMathAPI;

public class StringEndsWith {
    public static void main(String[] args) {
        String string = "This is an example string";
        String suffix = "string";
        boolean result = suffix(string,suffix);
        System.out.println(result);
    }

    public static boolean suffix(String string, String suffix){
        return string.endsWith(suffix);
    }
}
