package book.StringJavaMathAPI;

import java.time.LocalTime;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scan.nextLine();

        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if ( hour >= 0 && hour < 12){
            System.out.println("Good Morning, " + name + "!");
        }else if ( hour >= 12 && hour < 18){
            System.out.println("Goof Afternoon, " + name + "!");
        }else if  (hour >= 18 && hour < 22){
            System.out.println("Goof Evening, " + name + "!");
        }else {
            System.out.println("Goof night, " + name + "!");
        }
    }
}
