package controlstatements;

public class Calculatorpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=10;
		char operator='-';
		switch(operator)
		{
		case '+':System.out.println("addition"+(a+b));
		break;
		case '-':System.out.println("Subtraction"+(a-b));
		break;
		case '*':System.out.println("Multiplication"+(a*b));
		break;
		case '/':System.out.println("Division"+(a/b));
		break;
		default:System.out.println("Invalid choice");
		
		}

	}

}
