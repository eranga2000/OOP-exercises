package BankingSystem;

class SavingsAccount extends BankAccount {
    private static final int MAX_WITHDRAWALS = 5;
    private int withdrawalsThisMonth;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
        this.withdrawalsThisMonth = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalsThisMonth < MAX_WITHDRAWALS) {
            super.withdraw(amount);
            withdrawalsThisMonth++;
        } else {
            System.out.println("Withdrawal limit reached for this month.");
        }
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.03; // 3% interest
    }
}
