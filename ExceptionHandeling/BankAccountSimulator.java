package book.ExceptionHandeling;

import java.util.Scanner;

public class BankAccountSimulator {
    private double balance;

    public BankAccountSimulator(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws NotPositive {
        if (amount < 0 || amount == 0) {
            throw new NotPositive("Enter a positive amount to withdraw");
        }
        setBalance(getBalance() + amount);
    }


    public void withdraw(double amount) throws InvalidAmount, NotPositive {

        if (amount < 0 || amount == 0) {
            throw new NotPositive("Enter a positive amount to withdraw");
        }
        if (getBalance() <= amount) {
            throw new InvalidAmount("Not sufficient fund.");
        }
        setBalance(getBalance() - amount);

    }


    class NotPositive extends Exception {
        public NotPositive(String message) {
            super(message);
        }
    }

    class InvalidAmount extends Exception {
        public InvalidAmount(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {

        BankAccountSimulator sm = new BankAccountSimulator(10000);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a choice: ");
        System.out.println("1 : Deposit ");
        System.out.println("2 : Withdraw ");
        int a = scan.nextInt();

        switch (a) {
            case 1:
                System.out.print("Enter the amount : ");
                double b = scan.nextDouble();
                try {
                    sm.deposit(b);
                    System.out.println("New Balance : " + sm.getBalance());
                } catch (NotPositive e) {
                    throw new RuntimeException(e);
                }
            case 2:
                System.out.println("Enter the amount : ");

                double c = scan.nextDouble();
                try {
                    sm.withdraw(c);
                    System.out.println("New Balance : " + sm.getBalance());
                } catch (NotPositive | InvalidAmount e) {
                    throw new RuntimeException(e);
                }
        }

    }
}
