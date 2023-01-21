package book;

import java.util.Scanner;

public class ChapterFour5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 12: ");
        String month = "";
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> month = "January: 31 days";
            case 2 -> month = "February: 28 days and 29 in every leap year";
            case 3 -> month = " March: 31 days";
            case 4 -> month = "April: 30 days";
            case 5 -> month = "May: 31 days";
            case 6 -> month = "June: 30 days";
            case 7 -> month = "July: 31 days";
            case 8 -> month = "August: 31 days";
            case 9 -> month = "September: 30 days";
            case 10 -> month = "October: 31 days";
            case 11 -> month = "November: 30 days";
            case 12 -> month = "December: 31 days";
            default -> System.out.println("Not applicable");
        }
        System.out.println(month);
    }
}
