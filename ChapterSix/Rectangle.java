package book.ChapterSix;
// Chapter six problem Twelve and Thirteen.
public class Rectangle {
    // fields for the length and width of the rectangle
    private int length;
    private int width;

    // field for the color of the rectangle
    private String color;

    // constructor that takes two parameters for the length and width and initializes these fields
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

        // set the color field to "red" by default
        this.color = "red";
    }

    public int areaOfRectangle(){
        return length * width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }// problem twelve finished here

    // Problem Thirteen solve began here.

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);
        System.out.println("The color of the rectangle is: " + r.getColor());
        System.out.println("The area of the rectangle is: " + r.areaOfRectangle());
        r.setColor("orange");
        System.out.println("The color of the rectangle is: " + r.getColor());
    }
}
