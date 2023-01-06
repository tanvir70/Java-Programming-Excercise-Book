package book.ChapterSeven;

public class Salesperson extends Employee{
    private int salesTotal;
    private int commissionRate;

    public Salesperson (String name, int salary, String designation, int salesTotal, int commissionRate){
        super(name, salary, designation);
        this.commissionRate = commissionRate;
        this.salesTotal = salesTotal;
    }
}
