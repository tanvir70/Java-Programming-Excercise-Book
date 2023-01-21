package book.ChapterFive;

import java.util.Objects;
import java.util.Scanner;

public class ChapterFive23 {
    public static void main(String[] args) {
        String[][] countries = new String[10][4];

        countries[0][0] = "Bangladesh";
        countries[0][1] = "Dhaka";
        countries[0][2] = "Taka";
        countries[0][3] = "Bangla";

        countries[1][0] = "India";
        countries[1][1] = "Delhi";
        countries[1][2] = "Rupee";
        countries[1][3] = "Hindi";

        countries[2][0] = "Afghanistan";
        countries[2][1] = "Kabul";
        countries[2][2] = "Afghani";
        countries[2][3] = "Pastor";

        countries[3][0] = "Albania";
        countries[3][1] = "Tirane";
        countries[3][2] = "Lek";
        countries[3][3] = "Albanian";

        countries[4][0] = "Algeria";
        countries[4][1] = "Algiers";
        countries[4][2] = "Dinar";
        countries[4][3] = "Arabic";

        countries[5][0] = "Angola";
        countries[5][1] = "Luanda";
        countries[5][2] = "New Kwanza";
        countries[5][3] = "Portuguese";

        countries[6][0] = "Argentina";
        countries[6][1] = "Buenos Aires";
        countries[6][2] = "Peso";
        countries[6][3] = "Spanish";

        countries[7][0] = "Belarus";
        countries[7][1] = "Minsk";
        countries[7][2] = "Belorussian ruble";
        countries[7][3] = "Russian";

        countries[8][0] = "Bhutan";
        countries[8][1] = "Thimphu";
        countries[8][2] = "Ngultrum";
        countries[8][3] = "Dzongkha";

        countries[9][0] = "Brazil";
        countries[9][1] = "Brasilia";
        countries[9][2] = "Real";
        countries[9][3] = "Portuguese";

        Scanner scanner = new Scanner(System.in);
        String answer = " ";
        int correctAnswer = 0;
        int wrongAnswer = 0;

        // need to work on this

        System.out.println("The game has started. Enter 'no' to stop the game ");

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 4; j++) {

                if (Objects.equals(answer, "no")) {
                    break;
                } else {
                    System.out.println("What is the capital of" + countries[i][j] + "?");
                    answer = scanner.nextLine();

                    if (Objects.equals(countries[i][j], answer)) {
                        System.out.println("Well done");
                        correctAnswer++;
                    }else {
                        System.out.println("The correct answer should be " + countries[i][j]);
                        wrongAnswer--;
                    }

                    System.out.println("What is the capital of Bangladesh? ");
                    answer = scanner.nextLine();

                    if (Objects.equals(countries[i][j], answer)) {
                        System.out.println("Well done");
                        correctAnswer++;
                    }else {
                        System.out.println("The correct answer should be " + countries[i][j]);
                        wrongAnswer--;
                    }

                }
            }
        }
    }
}
