package book.StringJavaMathAPI;

public class LineCount {
    public static void main(String[] args) {
        String string = "the quick brown fox. The slow white dog.  the fast horse.";
        int count = countLine(string);
        System.out.println(count);

    }

    public static int countLine ( String string){

        return string.split("\\.").length;
    }
}

