package book.ExceptionHandeling;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a URL
        System.out.print("Enter a URL: ");
        String urlString = input.nextLine();

        try {
            // Convert the user's input to a URL object
            URL url = new URL(urlString);

            // Print the URL object
            System.out.println("URL object: " + url);
        } catch (MalformedURLException e) {
            // Print an error message if the URL is invalid
            System.out.println("Invalid URL: " + urlString);
        }
    }

}
