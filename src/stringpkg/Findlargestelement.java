package stringpkg;

import java.util.Scanner;

public class Findlargestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[3];
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]= sc.nextInt();
		}
		int largest=ar[0];
		for(int i=1;i<3;i++)
		{
			if(ar[i]>largest)
			{
				largest=ar[i];
			}
		}
		System.out.println("largest number in the array is:"+largest);

	}

}
