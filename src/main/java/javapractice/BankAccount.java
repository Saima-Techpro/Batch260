package javapractice;

public class BankAccount {

    private static int accountCounter = 0; // Static variable to count the number of accounts
    private int accountNumber; // Unique account number for each account
    private String ownerName;
    private double balance;

    // Static block to initialize static variables
    static {
        accountCounter = 1000; // Starting account number
        System.out.println("Static block executed: Initializing accountCounter to 1000");
    }

    // Instance block to initialize instance variables
    {
        this.accountNumber = ++accountCounter; // Increment account counter for each new account
        this.balance = 100.0; // Every account starts with a minimum balance of 100
        System.out.println("Instance block executed: Setting initial balance to 100 and account number");
    }

    // Constructor to initialize the owner's name
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        System.out.println("Constructor executed: Initializing ownerName to " + ownerName);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice");
        account1.displayAccountDetails();

        BankAccount account2 = new BankAccount("Bob");
        account2.displayAccountDetails();
    }
}
/*
Breakdown:
Static Block:

Purpose: Initialize the accountCounter to 1000 when the class is loaded.
Execution: This block runs once, when the BankAccount class is loaded by the JVM, setting up the starting account number.
Instance Block:

Purpose: Initialize each new account with a unique account number and a minimum balance of 100.
Execution: This block runs every time a new instance of BankAccount is created, ensuring each account has the proper initial values before the constructor runs.
Constructor:

Purpose: Initialize the ownerName for each new account.
Execution: This runs after the instance block, setting up the owner name.


Explanation:
The static block sets up the initial account number counter when the class is first loaded.
For each BankAccount instance created (account1 and account2), the instance block initializes the account number and balance.
The constructor sets the owner's name.
This example demonstrates the proper use of static and instance blocks in a realistic scenario, showcasing their roles in initializing class-level and instance-level data.

 */