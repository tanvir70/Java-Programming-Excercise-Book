package book;
public class ChapterFour14 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        do {
            System.out.println(i);
            i++;
            count++;
            if ( count == 10){
                System.out.println("Printing a line after 10th digit.");
                count = 0;
            }
        } while (i <= 100);

    }
}
