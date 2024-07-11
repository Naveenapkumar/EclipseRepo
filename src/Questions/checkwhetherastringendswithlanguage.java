package Questions;

import java.util.Scanner;

public class checkwhetherastringendswithlanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the string");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       if(s.endsWith("language"))
       {
    	   System.out.println("Entered string ends with the string language ");
       }
       else
    	   System.out.println("Entered string doesnot ends with the string language ");

	}

}
