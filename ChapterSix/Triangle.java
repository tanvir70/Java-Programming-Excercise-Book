package book.ChapterSix;
// Chapter six problem Fourteen and Fifteen.
public class Triangle {
    private int oneSideOfTriangle;
    private int otherSideOfTriangle;
    private int anotherSideOfTriangle;
    private String color;

    public Triangle(int one, int two, int three) {
        this.oneSideOfTriangle = one;
        this.otherSideOfTriangle = two;
        this.anotherSideOfTriangle = three;
        this.color = "green";
    }

    public Triangle(int one, int two, int three, String color) {
        this.oneSideOfTriangle = one;
        this.otherSideOfTriangle = two;
        this.anotherSideOfTriangle = three;
        this.color = color;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(5,7,10);
        Triangle t2 = new Triangle(6,2,9,"red");
    }
}
