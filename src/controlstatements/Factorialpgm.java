package controlstatements;

public class Factorialpgm {

    public static void main(String[] args) {
        int a = 5;
        int factorial = 1;
        
        for(int i = 1; i <= a; i++) {
            factorial *= i; 
        }
        
        System.out.println("Factorial of " + a + " is: " + factorial);
    }
}
