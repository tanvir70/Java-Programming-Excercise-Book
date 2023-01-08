package book.ExceptionHandeling;

import java.util.Objects;

public class PositiveNumber {
    public void positiveNumberDetector(int a, int b) {
        if (a <= 0 || b <= 0 || Objects.isNull(a) || Objects.isNull(b)) {
            throw new IllegalArgumentException("Only positive number allowed");
        } else {
            System.out.println("Positive Number. ");
        }
    }

    public static void main(String[] args) {
        PositiveNumber pn = new PositiveNumber();
        pn.positiveNumberDetector(10, 20);
    }
}
