package book.ChapterSeven;

import java.io.Serializable;

public class Manager extends Employee implements Payable{

    private String department;

    public Manager(String name, int salary, String designation, String department) {
        super(name, salary, designation);
        this.department = department;
    }

    @Override
    public int calculatePay(int numberOfHours) {

        
        return 0;
    }
}
