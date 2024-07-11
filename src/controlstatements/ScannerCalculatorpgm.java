package controlstatements;

import java.util.Scanner;

public class ScannerCalculatorpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number");
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter second number");

		int b=sc.nextInt();
		System.out.println("Enter the type of operation");
		char operation=sc.next().charAt(0);
		
		switch(operation)
		{
		case '+':System.out.println("addition: "+(a+b));
		break;
		case '-':System.out.println("Subtraction: "+(a-b));
		break;
		case '*':System.out.println("Multiplication: "+(a*b));
		break;
		case '/':System.out.println("Division: "+(a/b));
		break;
		default:System.out.println("Invalid choice");
		
		}
	}

}
