package book.StringJavaMathAPI;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class ValidURL {
    public static boolean isValidURL(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (URISyntaxException exception) {
            return false;
        } catch (MalformedURLException exception) {
            return false;
        }
    }

    public static void main(String[] args) {
        String url = "https://www.example.com";
        if (isValidURL(url)) {
            System.out.println("URL is valid");
        } else {
            System.out.println("URL is not valid");
        }
    }
}
