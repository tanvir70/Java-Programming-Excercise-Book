package book.ChapterSeven;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private String customer;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(int orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product product ){
        products.add(product);


    }

    public void removeProduct(Product product ){
        products.remove(product);
    }

    public int totalPrice(){
int totalPrice = 0;
        for (Product product:products) {
            totalPrice += product.getPrice()*product.getQuantity();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer='" + customer + '\'' +
                ", products=" + products +
                '}';
    }

    public static void main(String[] args) {
        Order ob = new Order(1,"Tanvir");
        Product apple = new Product("apple",10,12);
        Product orange = new Product("orange",20,12);

        ob.addProduct(apple);
        ob.addProduct(orange);

        System.out.println("Your order list : " + ob);
        int totalPrice = ob.totalPrice();
        System.out.println("Total price : " + totalPrice);
    }
}
