package controlstatements;

import java.util.Scanner;

public class Palindromennmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");//123
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int originalnum=num;
		int rev=0;
		while(num>0)
		{
			int a=num%10; //3  2 1
			rev=rev*10+a;//3 32 321
			num=num/10;//12 1 0
			
		}
		if(originalnum==rev)
		{
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("not Palindrome");
		}
	}

}
