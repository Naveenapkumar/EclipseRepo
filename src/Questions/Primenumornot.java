package Questions;

import java.util.Scanner;

public class Primenumornot {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a <= 1) {
            System.out.println(a + " is not a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= a/2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a + " is a prime number.");
            } else {
                System.out.println(a + " is not a prime number.");
            }
        }
    }
}
