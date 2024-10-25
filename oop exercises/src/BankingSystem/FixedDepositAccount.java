package BankingSystem;

// FixedDepositAccount subclass with restricted withdrawal
class FixedDepositAccount extends BankAccount {
    private int termInYears;

    public FixedDepositAccount(String accountNumber, String accountHolderName, double initialBalance, int termInYears) {
        super(accountNumber, accountHolderName, initialBalance);
        this.termInYears = termInYears;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed on Fixed Deposit accounts until maturity.");
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.05 * termInYears; // 5% interest per year
    }
}