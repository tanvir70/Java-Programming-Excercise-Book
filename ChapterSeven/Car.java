package book.ChapterSeven;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private String owner;

    public Car(String make, String model, int year, String owner) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.owner = owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
