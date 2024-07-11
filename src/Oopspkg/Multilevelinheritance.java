package Oopspkg;

class Father
{
	public void fathermethod()
	{
		System.out.println("Hello,this is father method");
	}
	




}

class Son extends Father
{
	public void sonmethod()
	{
		System.out.println("Hello,this is son method");
	}
	




}

class Grandson extends Son
{
	public void grandsonmethod()
	{
		System.out.println("Hello,this is grandson method");
	}
	

}



public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Grandson obj=new Grandson();
     obj.fathermethod();
     obj.sonmethod();
     obj.grandsonmethod();
	}

}
