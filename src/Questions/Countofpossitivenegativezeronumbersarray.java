package Questions;

import java.util.Scanner;

public class Countofpossitivenegativezeronumbersarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countpositive=0;
		int countnegative=0;
		int countzero=0;
		int[] ar=new int[10];
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			ar[i]= sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				countpositive++;
			}
			else if(ar[i]<0)
			{
				countnegative++;
			}
			else
			{
				countzero++;
			}
			
		}
		System.out.println("Count of positive number:"+countpositive);
		System.out.println("Count of negative numbers in an array:"+countnegative);
		System.out.println("Count of zero:"+countzero);

		

	}

}
