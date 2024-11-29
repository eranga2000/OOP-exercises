# 🏦 **Online Banking System in Java** 🏦

This project is an Object-Oriented Programming (OOP) exercise that demonstrates the key concepts of **Polymorphism**, **Abstraction**, **Inheritance**, and **Encapsulation**. The goal is to create an online banking system that can manage various types of bank accounts, such as **SavingsAccount**, **CurrentAccount**, and **FixedDepositAccount**.

## 💡 **Concepts Covered**
- **Polymorphism**: Overloading methods (`deposit()` and `withdraw()`) to handle different types of transactions.
- **Abstraction**: Using an abstract base class `BankAccount` to define common properties and methods.
- **Inheritance**: Different account types (Savings, Current, Fixed Deposit) inherit from `BankAccount` and implement their specific rules.
- **Encapsulation**: Protecting account data (like `accountNumber` and `balance`) by making them private and providing public getter and setter methods.

## 🔑 **Key Features**
- **Account Types**:  
  - `SavingsAccount`  
  - `CurrentAccount`  
  - `FixedDepositAccount`
  
- **Deposit Methods**:  
  - `deposit(double amount)`: Direct cash deposit  
  - `deposit(double amount, String chequeNumber)`: Cheque deposit  
  - `deposit(double amount, String chequeNumber, String bankName)`: Cross-bank cheque deposit

- **Withdraw Methods**:  
  - `withdraw(double amount)`: Simple withdrawal  
  - `withdraw(double amount, String atmLocation)`: ATM withdrawal

- **Account-Specific Rules**:  
  - `SavingsAccount`: Monthly withdrawal limit  
  - `CurrentAccount`: Overdraft feature (withdraw beyond balance)  
  - `FixedDepositAccount`: No withdrawals before term maturity

- **Interest Calculation**:  
  - `SavingsAccount`: Monthly interest accrual  
  - `FixedDepositAccount`: Annual compound interest  
  - `CurrentAccount`: No interest

## 📚 **Classes Overview**
### `BankAccount` (Abstract Class)
This is the base class for all account types. It contains common properties and abstract methods for transactions and interest calculations.

- **Properties**: 
  - `accountNumber`
  - `balance`
  - `accountHolderName`
  
- **Methods**: 
  - `deposit()`
  - `withdraw()`
  - `calculateInterest()` (abstract method)

### `SavingsAccount` (Subclass)
Inherits from `BankAccount` and implements the specific rules for savings accounts, such as the monthly withdrawal limit and interest accrual.

### `CurrentAccount` (Subclass)
Inherits from `BankAccount` and allows for overdraft transactions. It does not accrue interest.

### `FixedDepositAccount` (Subclass)
Inherits from `BankAccount` and restricts withdrawals until the deposit term has matured. It also implements fixed-rate interest calculation.

## 📈 **How It Works**
Each account type inherits the common methods from `BankAccount` but overrides certain methods to enforce specific rules. For instance, the `withdraw()` method in `SavingsAccount` checks if the monthly withdrawal limit is exceeded, while `CurrentAccount` allows overdrafts.

## 💾 **How to Use**
1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/online-banking-system.git

