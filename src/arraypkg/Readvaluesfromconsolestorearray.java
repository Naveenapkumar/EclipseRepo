package arraypkg;

import java.util.Scanner;

public class Readvaluesfromconsolestorearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[3];
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]= sc.nextInt();
		}
		System.out.println("entered numbers");
		//printing values present in the array using for each loop
		for(int v:ar)
		{
			System.out.println(v);
		}

	}

}
