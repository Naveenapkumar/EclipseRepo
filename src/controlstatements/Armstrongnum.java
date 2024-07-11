package controlstatements;
import java.util.Scanner;

public class Armstrongnum {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            num = num / 10;
        }
        
        if (originalNum == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

