package pkg;

public class swappingwithoutvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapping of two numbers without a variable
		int a=20,b=30;
		a = a + b; // Now, a = 50 and b = 30
		b = a - b; // Now, a = 50 and b = 20
		a = a - b; // Now, a = 30 and b = 20
		System.out.println("Value of a is"+a+"after swapping");
		System.out.println("Value of b is"+b+"after swapping");
		
		
		

	}

}
