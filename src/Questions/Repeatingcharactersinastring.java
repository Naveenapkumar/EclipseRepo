package Questions;

import java.util.Scanner;

public class Repeatingcharactersinastring {

    public static void main(String[] args) {
    	System.out.println("Enter the string");
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == currentChar) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(currentChar + " : " + count + " times");
            }
        }
    }
}
