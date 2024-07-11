package Method;

import java.util.Scanner;
//pgm to find the sum of digits
public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			sum=sum+b;
			a=a/10;
			
		}
		System.out.println("Sum of digits:"+sum);
		
	}

}
