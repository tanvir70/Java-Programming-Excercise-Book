package book.ExceptionHandeling;

import java.util.Scanner;

public class EmptyStringEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String message = scan.nextLine();
        try {
            if (scan.equals(null)){
                throw new EmptyStringException("Error: The input string is empty.");
            }else {
                System.out.println(message);
            }
        }catch (EmptyStringException e){
            e.printStackTrace();
        }
    }
}

class EmptyStringException extends Exception{
    public EmptyStringException( String message){
        super(message);
    }
}
