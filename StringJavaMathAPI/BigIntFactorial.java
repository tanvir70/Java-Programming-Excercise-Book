package book.StringJavaMathAPI;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class BigIntFactorial {
    public static void main(String[] args) {
        long number = (long) pow(10,100);
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + number + " is " + result);
    }
}

