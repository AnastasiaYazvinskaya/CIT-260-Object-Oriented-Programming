/*
Author: Anastasia Yazvinskaya
Class: CIT 260 - 04 (Fall 2021)
Assignment: Exercise 8 (2)
*/

package W08;

/* 
This program creates bank account objects with account number 
and balance, making deposits and withdrawals and 
displays the total balance in the account.

public class W8dot2:
    public static void main(String[] args)

(BankAccount.java)
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
public class W8dot2 {
    public static void main(String[] args) {
        //Tells the user what the program does. This program has no user input.
        System.out.println("This program tests the BankAccount class by ...");
        //Creates a BankAccount object with an account number of 123 and an initial balance of $5.00
        BankAccount account = new BankAccount(123, 5);
        System.out.format("...Creating account number %d with an initial balance of $%.2f%n", account.getAccountNumber(), account.getBalance());
        //Makes a deposit of $10.50 into this account.
        account.makeDeposit(10.5);
        //Makes a deposit of $3.25 into this account.
        account.makeDeposit(3.25);
        //Makes a withdrawal of $1.50 from this account.
        account.makeWithdrawal(1.5);
        //Displays the current balance in the account as shown in the example below.
        System.out.format("The balance in account number %d is $%.2f", account.getAccountNumber(), account.getBalance());
        //Output a goodbye message.
        System.out.format("%n%nGoodbye.");
    }
}
