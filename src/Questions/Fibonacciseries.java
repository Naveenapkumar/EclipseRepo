package Questions;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        System.out.println("Enter the number of terms required in Fibonacci series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        int a = 0, b = 1;
        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        
        
    }
}

