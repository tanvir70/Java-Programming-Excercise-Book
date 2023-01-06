package book.ChapterSeven;

public abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        double area = rectangle.area();
        System.out.println("area = " + area); // Output: 50
    }

}
