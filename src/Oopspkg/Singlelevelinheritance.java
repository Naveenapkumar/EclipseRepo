package Oopspkg;

class Parent
{
	public void parentmethod()
	{
		System.out.println("Hello ,this is parent method");
	}



}

class Child extends Parent
{
	public void childmethod()
	{
		System.out.println("Hello ,this is child method");
	}
	


}





public class Singlelevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.parentmethod();
		obj.childmethod();

	}

}
