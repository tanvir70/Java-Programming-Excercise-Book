package book.ChapterSeven;

// problem 1 and 2
public class Product {
    // Fields for the product's name, price, and quantity
    private String name;
    private double price;
    private int quantity;

    private int sku;

    // Constructor to initialize the product's fields
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for the product's name
    public String getName() {
        return name;
    }

    // Setter method for the product's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the product's price
    public double getPrice() {
        return price;
    }

    // Setter method for the product's price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for the product's quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the product's quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSku() {
        return sku;
    }

    // Setter method for the product's price
    public void setSku(int sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", sku=" + sku +
                '}';
    }
}
