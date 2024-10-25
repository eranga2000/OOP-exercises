package BankingSystem;

// Abstract class BankAccount with encapsulated properties, overloaded methods, and abstract method
abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getters and setters for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Overloaded deposit methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void deposit(double amount, String chequeNumber) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " using cheque #" + chequeNumber + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void deposit(double amount, String chequeNumber, String bankName) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " from " + bankName + " using cheque #" + chequeNumber + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Overloaded withdraw methods
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void withdraw(double amount, String atmLocation) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from ATM at " + atmLocation + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Abstract method to be overridden in subclasses
    public abstract double calculateInterest();
}
