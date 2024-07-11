package stringpkg;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
    
        }
//        System.out.print(rev);
        if(s.equals(rev)) 
        {
        	System.out.println("Entered string is palindrome");
        }
        else
        {
        	System.out.println("Entered string is not palindrome");
        }
    }
}

