package pkg;

public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //arithmetic operator
		int a=50,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operators
		int z=a;
		System.out.println(z);
		a+=b;
		System.out.println(a+=b);
		System.out.println(a-=b);
		
		//Relationl operators
		int v1=50 ,v2=30;
		System.out.println(v1==v2);
		System.out.println(v1>v2);
		System.out.println(v1<v2);
		System.out.println(v1>=v2);
		System.out.println(v1<=v2);
		System.out.println(v1!=v2);
		
		//Logical operators
		
		String username="Naveena";
		String pwd="Naveena123";
		System.out.println(username=="Naveena" && pwd=="Naveena123");
		System.out.println(username=="Naeena" || pwd=="Naveena123");
		System.out.println(!(username=="Naveena"));
		System.out.println(!(pwd=="Naveena"));
		
		
		
		//Unary operator
		int v4=6;
		System.out.println(v4++);
		System.out.println(v4);
		System.out.println(v4++);
		System.out.println(++v4);
		System.out.println(v4--);
		System.out.println(v4);

		
		//ternary operator
		
		String ans=v1<v2?"V1 is greater":"V2 is greater";
		System.out.println(ans);


		
	}

}
