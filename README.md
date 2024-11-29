

This is an **OOP exercise** that covers the core principles of **Polymorphism**, **Abstraction**, **Inheritance**, and **Encapsulation**.

You are developing an online banking system in **Java** to manage different types of bank accounts, such as **SavingsAccount**, **CurrentAccount**, and **FixedDepositAccount**. Each account type has specific features and rules for transactions, so you decide to create an **abstract base class** `BankAccount` with properties like `accountNumber`, `balance`, and `accountHolderName`. To protect data and ensure that only valid operations are performed, you will use **encapsulation** by setting the properties as private and providing public getter and setter methods as appropriate.



The system should allow customers to **deposit** and **withdraw** money in multiple ways, so you will overload the `deposit()` and `withdraw()` methods in `BankAccount` to support different types of transactions.

### **Deposit Methods**:
- `deposit(double amount)`: Allows a direct cash deposit.
- `deposit(double amount, String chequeNumber)`: Handles a cheque deposit, requiring both an amount and a cheque number.
- `deposit(double amount, String chequeNumber, String bankName)`: Processes a cheque deposit from another bank, requiring an amount, cheque number, and the bank name.

### **Withdraw Methods**:
- `withdraw(double amount)`: Allows a simple withdrawal.
- `withdraw(double amount, String atmLocation)`: Processes an ATM withdrawal, requiring the amount and the location of the ATM.

Each subclass (`SavingsAccount`, `CurrentAccount`, and `FixedDepositAccount`) will **inherit** from `BankAccount`, and each will implement specific rules for transactions:

- **SavingsAccount** may have a **monthly withdrawal limit**, which should be enforced in the `withdraw()` method.
- **CurrentAccount** might allow an **overdraft feature**, where withdrawals can exceed the balance up to a certain limit.
- **FixedDepositAccount** may restrict withdrawals altogether until the deposit term has matured.

## 📊 **Interest Calculation**:

Define an abstract method `calculateInterest()` in `BankAccount`, which each subclass will implement according to its own interest rules:
- **SavingsAccount**: Accrues **monthly interest**.
- **FixedDepositAccount**: Accrues interest at a **fixed rate**, compounded annually.
- **CurrentAccount**: Does not accrue interest.

---

Hope this helps you with your project! If you have any further questions, feel free to ask. 😄


