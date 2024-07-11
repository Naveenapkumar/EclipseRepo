package controlstatements;

public class blooddonation {
    public static void main(String[] args) {
        int age = 19, weight = 54;
        if (age > 18) {
            if (weight > 55) {
                System.out.println("Eligible for donating blood");
            } else {
                System.out.println("Not eligible for blood donation,minimum weight required is 55");
            }
        } else {
            System.out.println("Not Eligible for donating blood");
        }
    }
}



