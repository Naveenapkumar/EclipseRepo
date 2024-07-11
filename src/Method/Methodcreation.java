package Method;

public class Methodcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodcreation obj=new Methodcreation();
		obj.add();
		int value=obj.sub();
		System.out.println(value);
		obj.mul(20, 20);
		double result=obj.div(10, 5);
		System.out.println("division"+result);

	}
	//method without parameter and without returntype
	public void add()
	{
		int a=11,b=11,c;
		c=a+b;
		System.out.println("Addition of two values:"+c);
		
	}
	//method with returntype and without parameter
	public int sub()
	{
		int a=11,b=11,c;
		c=a-b;
		return c;
	}
	
	//method with parameter and without returntype
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Multipliction"+c);
	}
	
	//method with parameter and with returntype
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
	}

}
