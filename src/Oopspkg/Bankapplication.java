package Oopspkg;

import java.util.Scanner;

interface Bank {
    void accountDetails();
    double checkBalance();
    void withdraw();
    void deposit();
}

class SBI implements Bank
{
double balance=2000;


    @Override
    public void accountDetails() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the account number:");
    long accnum = sc.nextLong();

    sc.nextLine();
    System.out.println("Enter the account holder name:");
    String name=sc.nextLine();

    System.out.println("Enter the IFSC Code:");
    String ifsc = sc.nextLine();
    
    System.out.println("Enter the Branch name:");
    String bname = sc.nextLine();

    System.out.println("Account number: " + accnum);
    System.out.println("Account Holder Name: " + name);
    System.out.println("IFSC code: " + ifsc);
    System.out.println("Branch Name: " +bname) ;

}


	@Override
	public double checkBalance() {
		return balance;
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount you want to withdraw:");
	    Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		
		  if (amount > balance) {
	            System.out.println("Sorry,Insufficient balance. Withdrawal failed.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
	        }		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount you want to deposit:");
	    Scanner sc=new Scanner(System.in);
		double amount=sc.nextDouble();
		
		balance += amount;
	    System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
		
	}
	

}


public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SBI obj=new SBI();
    boolean stop=false;
    while(!stop)
    {
    	System.out.println("Welcome to SBI Banking Application,Please choose an option to proceed further");
    	System.out.println("Choose 1 for viewing Account Details");
    	System.out.println("Choose 2 for checking Balance");
    	System.out.println("Choose 3 for money deposit");
    	System.out.println("Choose 4 for money withdrawal");
    	System.out.println("Choose 5 for exit");
    	Scanner sc=new Scanner(System.in);
    	int choice=sc.nextInt();
    	
        switch(choice)
        {
        case 1:obj.accountDetails();
        break;
        case 2:double x=obj.checkBalance();
		System.out.println("Current Balance:" +x);
        break;
        case 3:obj.deposit();
        break;
        case 4:obj.withdraw();
        break;
        case 5:stop=true;
        break;
        default:
            System.out.println("Invalid choice. Please try again.");

        
        }
    		
    	
    }
	}

}
