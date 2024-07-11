package Oopspkg;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading obj=new Methodoverloading();
		obj.add();
		obj.add(100, 1);
		obj.add(102.5,10);
		obj.add(30,111.1);
		

	}
	public void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
 
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}


}
