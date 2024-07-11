package Method;

import java.util.Scanner;

public class Charactercount {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        int count = 0;

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (ch != ' ') {
                count++;
            }
        }

        System.out.println("The number of characters in the string is: "+count);
    }
}
