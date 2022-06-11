package Q2Financial;

import java.util.Scanner;

/*
Programmer Name: Ryan Teixeira
Student Number: 991291764
 */
 /*
Here is a designed main method that test a class called Account to add, 
withdraw and inquire current balance.The main method creates a new bank object
from the bank class that has a checking and savings data field, can deposit, 
withdraw, transfer and print balance. If no value is passed the initial balance 
is set to $0. A $5 penalty is made if more money is withdrawn than 
in the account.
 */
public class BankDemo {

    public static void main(String[] args) {

        Bank bank6 = new Bank();
        bank6.printBalance();
        
        System.out.println("\nSet balance");
        bank6.checking.setBalance(500);
        bank6.savings.setBalance(1000);
        bank6.printBalance();

        System.out.println("\nDeposit");
        bank6.deposit(50, "C");
        bank6.deposit(200, "S");
        bank6.printBalance();

        System.out.println("\nWithdraw");
        bank6.withdraw(300, "C");
        bank6.withdraw(500, "S");
        bank6.printBalance();
        
        System.out.println("\nWithdraw amount not available");
        bank6.withdraw(1000, "C");
        bank6.withdraw(2000, "S");
        bank6.printBalance();

        System.out.println("\nTransfer $100 Checking to Savings");
        bank6.transfer(100, "C");
        bank6.printBalance();

        System.out.println("\nTransfer $100 Savings to Checking");
        bank6.transfer(50, "S");
        bank6.printBalance();
        System.out.println("\nProgrammer: Ryan Teixeira");

    } 

}

