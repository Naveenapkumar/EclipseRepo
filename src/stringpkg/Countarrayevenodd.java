package stringpkg;

import java.util.Scanner;

public class Countarrayevenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numbers");
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		int even=0;
		int odd=0;
		for(int i=0;i<5;i++) 
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				even=even+1;
			}
			else {
				odd=odd+1;
			}
		}
		System.out.println("Evencount"+even);
		System.out.println("Oddcount"+odd);

	}

}
