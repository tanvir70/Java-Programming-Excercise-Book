package book.ChapterSix;

// Chapter six problem Ten and Eleven
public class Employee {
    private String name;
    private int salary;
    private String designation;

    public Employee(String name, int salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    // Problem 10 solved


    //For problem 11  solve began here :
    public static void main(String[] args) {
        Employee p = new Employee("Tanvir", 150000, "Junior Software developer");
        String name = p.getName();
        String designation = p.getDesignation();
        int salary = p.getSalary();

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}


