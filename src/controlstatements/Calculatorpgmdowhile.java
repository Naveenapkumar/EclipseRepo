package controlstatements;

import java.util.Scanner;

public class Calculatorpgmdowhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueCalculation;

        do {
            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            System.out.println("Enter the type of operation (+, -, *, /):");
            char operation = sc.next().charAt(0);

            switch(operation) {
                case '+':
                    System.out.println("Addition: " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction: " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                    	
                        System.out.println("Division: " + (a / b));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Do you want to perform another calculation? (y/n):");
            continueCalculation = sc.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        sc.close();
    }
}

