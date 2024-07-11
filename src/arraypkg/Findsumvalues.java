package arraypkg;

import java.util.Scanner;

public class Findsumvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[4];
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<4;i++)
		{
			ar[i]= sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("Sum of numbers in the array:" +sum);
		
	}

}