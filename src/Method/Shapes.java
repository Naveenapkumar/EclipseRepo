package Method;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj=new Shapes();
		int value=obj.square(4);
		System.out.println("Area of square"+value);
		obj.circle();
		double result=obj.triangle();
		System.out.println("Area of triangle:"+result);
		obj.rectangle(6, 5);
	}
	//with returntype and with parameter
	public int square(int a)
	{
		int c=a*a;
		return c;
		
	}
	//without returntype and without parameter
	public void circle()
	{
		double r=2.11;
		double area=3.14*r*r;
		System.out.println("Area of circele"+area);
		
	}
	
	//with returntype and without parameter
	public double triangle()
	{
		int a=2;
		int b=3;
		double area=0.5*a*b;
		return area;
	}
//witout returntype and with parameter
	public void rectangle(int a,int b)
	{
		int area=a*b;
		System.out.println("Area of rectangle:"+area);
	}
}
