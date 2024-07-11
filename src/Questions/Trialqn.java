package Questions;

import java.util.Scanner;

public class Trialqn {

    public static void main(String[] args) {
        // Prompt the user to enter a string
        System.out.println("Enter the num of rows:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++) {
        	
        	for (int j=0;j<(i+1);j++)
        	{
        		System.out.print("*");
        	}        
    		System.out.println("");

        }
        
    }
}
