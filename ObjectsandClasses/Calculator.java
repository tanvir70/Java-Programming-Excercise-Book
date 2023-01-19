package book.ChapterSix;
// Chapter six problem Sixteen,Seventeen, Eighteen, nineteen, twenty, twenty One and Twenty two.
public class Calculator {
    // method for performing addition of two int arguments
    public int add(int x, int y) {
        return x + y;
    }

    // method for performing subtraction of two int arguments
    public int subtract(int x, int y) {
        return x - y;
    }

    // method for performing multiplication of two int arguments
    public int multiply(int x, int y) {
        return x * y;
    }// Sixteen end here

    // method for performing addition of three int arguments
    public int add(int x, int y, int z) { // problem eighteen part
        return x + y + z;
    }

    // method for performing addition of four int arguments
    public int add(int x, int y, int z, int a) { // problem nineteen part
        return x + y + z + a;
    }

    // method for performing addition and subtraction from three int arguments
    public int addAndSubtract(int x, int y, int z) { // problem twenty part
        return x + y - z;
    }

    // method for performing multiplication of three int arguments
    public int multiply(int x, int y, int z) { // problem twenty One part
        return x * y * z;
    }




    // seventeen Starts here :
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result = calc.add(5, 10);
        System.out.println("Result of addition: " + result);

        result = calc.subtract(10, 5);
        System.out.println("Result of subtraction: " + result);

        result = calc.multiply(5, 10);
        System.out.println("Result of multiplication: " + result); // seventeen ends here.

        result = calc.add(5,7,10); // problem eighteen part
        System.out.println("Result of addition: " + result);

        result = calc.add(5,7,10,100); // problem nineteen part
        System.out.println("Result of addition: " + result);

        result = calc.addAndSubtract(5,7,10); // problem twenty part
        System.out.println("Result of addition and subtraction: " + result);

        result = calc.multiply(5,7,10); // problem twenty One part
        System.out.println("Result of multiplication: " + result);

        // problem Twenty two is already solve by now
    }
}
