package book.ExceptionHandeling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

public class DownloadURL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input URL : ");
        String urlString = input.nextLine();
        try{
            URL url = new URL(urlString);
            System.out.println("URL object : " + url);
            ReadableByteChannel read = Channels.newChannel(url.openStream());
            FileOutputStream output = new FileOutputStream("info.html");
            output.getChannel().transferFrom(read,0,Long.MAX_VALUE);

        }catch (MalformedURLException e){
            System.out.println("Invalid URL : " + urlString);
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
