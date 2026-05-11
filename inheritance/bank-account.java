/*
Program 5: Bank Account Inheritance Program

Develop a Java program to create a superclass called Account
that contains the following members:

1. Account Number
2. Customer Name
3. Balance

Create two subclasses:
1. SavingsAccount
2. CurrentAccount

Implement methods for:
1. Deposit
2. Withdraw
3. Display Account Details

Apply suitable conditions for minimum balance
and insufficient balance handling.
*/

import java.util.Scanner;

// Superclass
class Account {

    int accountNumber;
    String customerName;
    double balance;

    Account(int accountNumber, String customerName, double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    void deposit(double amount) {

        balance += amount;

        System.out.println("Amount Deposited Successfully");
    }

    void display() {

        System.out.println("\nAccount Details");
        System.out.println("----------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Balance        : ₹" + balance);
    }
}

// Savings Account subclass
class SavingsAccount extends Account {

    double minimumBalance = 500;

    SavingsAccount(int accountNumber, String customerName, double balance) {

        super(accountNumber, customerName, balance);
    }

    void withdraw(double amount) {

        if ((balance - amount) >= minimumBalance) {

            balance -= amount;

            System.out.println("Withdrawal Successful");

        } else {

            System.out.println("Minimum balance must be maintained");
        }
    }
}

// Current Account subclass
class CurrentAccount extends Account {

    CurrentAccount(int accountNumber, String customerName, double balance) {

        super(accountNumber, customerName, balance);
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawal Successful");

        } else {

            System.out.println("Insufficient Balance");
        }
    }
}

// Main class
public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accNo;
        String name;
        double balance, depositAmount, withdrawAmount;

        // Savings Account
        System.out.println("Savings Account");

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        depositAmount = sc.nextDouble();

        sa.deposit(depositAmount);

        System.out.print("Enter Withdraw Amount: ");
        withdrawAmount = sc.nextDouble();

        sa.withdraw(withdrawAmount);

        sa.display();

        // Current Account
        System.out.println("\n\nCurrent Account");

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        depositAmount = sc.nextDouble();

        ca.deposit(depositAmount);

        System.out.print("Enter Withdraw Amount: ");
        withdrawAmount = sc.nextDouble();

        ca.withdraw(withdrawAmount);

        ca.display();

        sc.close();
    }
}

/*

Sample Output:

Savings Account
Enter Account Number: 101
Enter Customer Name: Priyanshu
Enter Initial Balance: 5000
Enter Deposit Amount: 2000
Amount Deposited Successfully
Enter Withdraw Amount: 3000
Withdrawal Successful

Account Details
----------------------
Account Number : 101
Customer Name  : Priyanshu
Balance        : ₹4000.0


Current Account
Enter Account Number: 201
Enter Customer Name: Rahul
Enter Initial Balance: 8000
Enter Deposit Amount: 1000
Amount Deposited Successfully
Enter Withdraw Amount: 2000
Withdrawal Successful

Account Details
----------------------
Account Number : 201
Customer Name  : Rahul
Balance        : ₹7000.0

*/
