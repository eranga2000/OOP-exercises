package BankingSystem;

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " with overdraft. New balance: " + getBalance());
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // Current accounts do not earn interest
    }
}