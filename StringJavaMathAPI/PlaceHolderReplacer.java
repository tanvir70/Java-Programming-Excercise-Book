package book.StringJavaMathAPI;

import java.util.HashMap;
import java.util.Map;

public class PlaceHolderReplacer {
    public static void main(String[] args) {

        String template = "Hello, {name}. Your email is {email}.";
        Map<String, String> values = new HashMap<>();
        values.put("name", "John");
        values.put("email", "john@example.com");

        String result = formatString(template, values);
        System.out.println(result);
    }
    public static String formatString(String template, Map<String, String> values) {
        String result = template;
        for (Map.Entry<String, String> entry : values.entrySet()) {
            result = result.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        return result;
    }

}
