package book.ChapterSeven;

public class AreaCalculator {

    public static final double PI = 3.1416;

    public double getArea(double radius) {
        return PI * radius * radius;
    }
    public double getArea(int length, int width) {
        return length * width;
    }

    public double getArea(double radius, double height) {
    return (2*PI * radius * height) + (2 * PI * radius * radius);
    }

    public static void main(String[] args) {
        AreaCalculator ob = new AreaCalculator();
        System.out.println("Area of a Circle : " + ob.getArea(5));
        System.out.println("Area of a Rectangle  : " + ob.getArea(5,6));
        System.out.println("Area of a Cylinder  : " + ob.getArea(5.2,6.7));
    }

}
