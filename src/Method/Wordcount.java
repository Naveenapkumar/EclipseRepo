package Method;

import java.util.Scanner;

public class Wordcount {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] words = value.split(" ");

        int wordcount=words.length;
        
        	

        System.out.println("The number of words in the string is: "+wordcount);
    }
}
