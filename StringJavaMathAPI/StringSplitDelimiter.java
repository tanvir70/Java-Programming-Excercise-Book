package book.StringJavaMathAPI;

import java.util.Arrays;

public class StringSplitDelimiter {
    public static void main(String[] args) {
        String string = "This is an example string";
        String delimiter = " ";
        String[] subString = splitSting(string,delimiter);
        System.out.println(Arrays.toString(subString));

    }

    public static String[] splitSting( String string,String delimiter){
        return string.split(delimiter);
    }
}
