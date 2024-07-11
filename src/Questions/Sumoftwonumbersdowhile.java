package Questions;

import java.util.Scanner;

public class Sumoftwonumbersdowhile {

	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String i;

		// TODO Auto-generated method stub
    do {
    	System.out.println("Enter the first number:");
    	int a=sc.nextInt();
    	System.out.println("Enter the second number:");
    	int b=sc.nextInt();
    	int c=a+b;
    	System.out.println("The sum of two numbers is:"+c);
    	System.out.println("Do you want to continue the operation:Type Y for yes,N for No");
    	i=sc.next();
    
	}
    while(i.equalsIgnoreCase("Y"));
    System.out.println("Program terminated");
	}

}
