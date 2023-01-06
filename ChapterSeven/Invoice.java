package book.ChapterSeven;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private static int ID_GENERATOR = 0;

    // a way to generate id automatically when object is created
    private int invoiceId = ++ID_GENERATOR;
    private String customer;
    private List<Product> items = new ArrayList<>();
    private int totalAmount;

    public Invoice(String customer) {
        this.customer = customer;
    }

    public void addItem(Product product) {
        this.items.add(product);
        this.totalAmount += product.getPrice() * product.getQuantity();
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Product> getItems() {
        return items;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Bazlur");
        var invoiceId1 = invoice.getInvoiceId();
        System.out.println("invoiceId1 = " + invoiceId1);
        Invoice invoice2 = new Invoice("Bazlur");
        var invoiceId2 = invoice2.getInvoiceId();
        System.out.println("invoiceId2 = " + invoiceId2);
    }
}

