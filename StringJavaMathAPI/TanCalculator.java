package book.StringJavaMathAPI;

public class TanCalculator {
    public static void main(String[] args) {
        double angleInRadians = 45;
        double sine = Math.tan(angleInRadians);
        System.out.println("The tangent of " + angleInRadians + " radians is: " + sine);
    }
}
