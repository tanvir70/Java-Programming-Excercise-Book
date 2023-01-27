package book.JavaIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileSearch {
    public static void main(String[] args) {
        String directory = "D:\\IdeaProjects\\tanvir\\src\\book\\Arrays";

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a file name : ");
        String filename = scan.nextLine();
        File file = new File(directory + "\\" + filename);

        if (file.exists()) {
            System.out.println("File exists in the directory.");
        } else {
            System.out.println("File dose not exits in the directory.");
        }
    }
}
