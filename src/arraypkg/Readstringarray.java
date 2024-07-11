package arraypkg;

import java.util.Scanner;

public class Readstringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] ar=new String[3];
        System.out.println("enter the names");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	ar[i]=sc.next();
        	
        }
        System.out.println("Entered names");
        for(int i=0;i<3;i++)
        {
        	System.out.println(ar[i]);
        }
	}

}
