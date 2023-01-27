package book.JavaIO;

import java.io.File;

public class FileCounter {
    public static void main(String[] args) {
        String directory = "D:\\IdeaProjects\\tanvir\\src\\book\\Arrays";
        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();

        int fileCount = 0;
        for (File file: listOfFiles) {
            /*if (file.isFile()){
                fileCount++; this is the better way .
            }*/
            fileCount++; // this simple line will work also if the directory doesn't contain anything but files.
        }
        System.out.println("Number of file in the directory " + directory + " : " + fileCount);
    }
}
