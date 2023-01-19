package book.ChapterSeven;

import java.util.Scanner;

public class ATMMachine {

    public double balance;

    public ATMMachine(double balance) {
        this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    public void deposit(double amount) {

        setBalance(getBalance() + amount);
    }

    public static void main(String[] args) {
        ATMMachine ob = new ATMMachine(100000);
        String systemAccountNo = "12462486";
        String systemPasswordNo = "j3GbAeY6";
        System.out.println("Enter your account no : ");
        Scanner scanner = new Scanner(System.in);
        String accountNo = scanner.nextLine();
        System.out.println("Enter your password : ");
        String password = scanner.nextLine();

        if (systemAccountNo.equals(accountNo) && systemPasswordNo.equals(password)){
            System.out.println("Login successful.\n");

            System.out.println("Main Menu");
            System.out.println("1 : Check Balance");
            System.out.println("2 : Withdraw");
            System.out.println("3 : Deposit");
            System.out.println("4 : Exit");
            System.out.println();

            int a = scanner.nextInt();

            switch (a){
                case 1 :
                    System.out.print("Current account balance : " + ob.getBalance());
                    break;
                case 2 :
                    System.out.println("Enter withdrawn amount : ");
                    int withdrawnAmount = scanner.nextInt();
                    ob.withdraw(withdrawnAmount);
                    System.out.print("Current account balance : " + ob.getBalance());
                    break;
                case 3 :
                    System.out.println("Enter deposit amount : ");
                    int depositAmount = scanner.nextInt();
                    ob.deposit(depositAmount);
                    System.out.print("Current account balance : " + ob.getBalance());

                    break;
                case 4 : break;

                default : throw new IllegalStateException("Unexpected value: " + a);
            }
        }else {
            System.out.println("Your account no or password is incorrect.");
        }




    }
}

