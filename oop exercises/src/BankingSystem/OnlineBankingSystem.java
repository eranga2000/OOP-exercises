package BankingSystem;

public class OnlineBankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SAV123", "Alice", 5000);
        BankAccount current = new CurrentAccount("CUR456", "Bob", 2000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD789", "Charlie", 10000, 2);

        // Demonstrate method overloading in deposit and withdraw methods
        savings.deposit(1000);
        savings.deposit(1500, "CHK123");
        savings.deposit(2000, "CHK456", "National Bank");

        current.withdraw(500);
        current.withdraw(800, "ATM Downtown");

        // Display interest calculation for each account type
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Current Account Interest: " + current.calculateInterest());
        System.out.println("Fixed Deposit Account Interest: " + fixedDeposit.calculateInterest());

        // Attempt restricted withdrawal on FixedDepositAccount
        fixedDeposit.withdraw(500);
    }
}