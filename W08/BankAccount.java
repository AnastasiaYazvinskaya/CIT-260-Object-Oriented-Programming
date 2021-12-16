/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 8 (2)
*/

package W08;
/*
BankAccount class for working with bank account. The account has 
its number and balance. By the default these values equel to 0. 
But can be created an account with the specified number and balance.
The class allows us to get the account number and balance, 
and work with balance such as make a deposit or withdrawal.

public class BankAccount:
    private int accountNumber;
    private double balance;
    public BankAccount()
    public BankAccount(int newAccountNumber, double newBalance)
    public int getAccountNumber()
    public double getBallance()
    public void makeDeposit(double deposit)
    public void makeWithdrawal(double withdrawal)
*/
public class BankAccount {
    //A data field named accountNumber that holds the account number for the account. This field is an integer.
    private int accountNumber;
    //A data field named balance that holds the balance in the account. This field is a double.
    private double balance;
    //A no-arg constructor that creates a default account object. It sets both data fields to zero.
    public BankAccount() {
        accountNumber = 0;
        balance = 0;
    }
    //A parameterized constructor that creates an account object with the specified account number and balance.
    public BankAccount(int newAccountNumber, double newBalance) {
        accountNumber = newAccountNumber;
        balance = newBalance;
    }
    //Getter methods for accountNumber and balance.
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    //A method named makeDeposit( ) that takes a double as its argument, and adds the value of the argument to the balance.
    public void makeDeposit(double deposit) {
        System.out.format("...Making a deposit of $%.2f%n", deposit);
        balance += deposit;
    }
    //A method names makeWithdrawal( ) that takes a double as its argument, and subtracts the value of the argument from the balance.
    public void makeWithdrawal(double withdrawal) {
        System.out.format("...Making a withdrawal of $%.2f%n", withdrawal);
        balance -= withdrawal;
    }
}
