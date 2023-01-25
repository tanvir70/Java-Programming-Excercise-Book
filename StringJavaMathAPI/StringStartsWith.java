package book.StringJavaMathAPI;

public class StringStartsWith {
    public static void main(String[] args) {
        String string = "This is an example string";
        String prefix = "This";
        boolean result = prefix(string,prefix);
        System.out.println(result);
    }

    public static boolean prefix (String string,String prefix){
        return string.startsWith(prefix);
    }
}
