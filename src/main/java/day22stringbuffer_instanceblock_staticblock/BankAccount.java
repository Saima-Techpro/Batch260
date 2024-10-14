package day22stringbuffer_instanceblock_staticblock;

public class BankAccount {

    // instance variables
    private int accountNum;
    private String ownerName;
    private int balance;

    // static variable
    private static int accountCounter = 0; // to count the number of accounts

    // instance block

    {
        this.accountNum = ++accountCounter;  // pre-increment => this will be used to assign unique count number to each account
        this.balance = 100;
        System.out.println("Instance block is being executed!!");
    }

    // static block
    static {
        accountCounter = 1000;
        System.out.println("Static block is being executed!!");
    }

    // Constructor => to create the account with the owner name
    public BankAccount(String ownerName){
        this.ownerName = ownerName;

    }

    // Method to display account details
    public void displayAccount(){
        System.out.println("accountNum = " + accountNum);
        System.out.println("balance = " + balance);
        System.out.println("ownerName = " + ownerName);
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Nataliya");  // instance
        account1.displayAccount();

        BankAccount account2 = new BankAccount("Uranus");  // instance
        account2.displayAccount();


    }

}
