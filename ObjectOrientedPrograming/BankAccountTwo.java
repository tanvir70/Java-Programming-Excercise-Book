package book.ChapterSeven;

public class BankAccountTwo {
    private double balance;
    private String ownerName;
    private String accountType;

    public BankAccountTwo(double balance, String ownerName, String accountType) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.accountType = accountType;
    }



    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
 class CheckingAccount extends BankAccountTwo {
    public CheckingAccount(double balance, String ownerName) {
        super(balance, ownerName, "checking");
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
}

 class SavingAccount extends BankAccountTwo {
    private double dailyLimit;
    private double todayWithdrawals;

    public SavingAccount(double balance, String ownerName, double dailyLimit) {
        super(balance, ownerName, "saving");
        this.dailyLimit = dailyLimit;
        this.todayWithdrawals = 0;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public double getTodayWithdrawals() {
        return todayWithdrawals;
    }

    public void setTodayWithdrawals(double todayWithdrawals) {
        this.todayWithdrawals = todayWithdrawals;
    }

    public boolean withdraw(double amount) {
        if (getBalance() >= amount && todayWithdrawals + amount <= dailyLimit) {
            setBalance(getBalance() - amount);
            todayWithdrawals += amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
}
