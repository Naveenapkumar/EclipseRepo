package Questions;

import java.util.Scanner;

public class Averagethreenums {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		
		Averagethreenums obj=new Averagethreenums();
		obj.average(a, b, c);

	}
	public void average(int a,int b,int c)
	{
		double avg=(a+b+c)/3;
		System.out.println("Average of three nums is:"+avg);
	}

}
