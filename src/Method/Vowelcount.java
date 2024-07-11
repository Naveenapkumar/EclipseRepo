package Method;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
		Vowelcount obj=new Vowelcount();
		obj.vowelCount(text);
		
//		System.out.println(text);
		

	}
	public void vowelCount(String text)
	{
		int count=0;

		for(int i=0;i<text.length();i++) 
			
		{
			char ch = text.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'|| ch == 'I'|| ch == 'O'|| ch == 'O'|| ch == 'u'|| ch == 'U') {
                count++;
            }
			
		}
		System.out.println("Number of vowels: " + count);
	}

}
