package Oopspkg;


public class ExceptionHandlingpgm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            int a = 30, b = 0, c; 
            c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) { 
            System.out.println(e.getMessage()); 
            System.out.println("Arithmetic exception"); 
        }
    }
}

