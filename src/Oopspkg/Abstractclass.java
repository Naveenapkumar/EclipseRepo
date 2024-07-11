package Oopspkg;

abstract class Car
{
	abstract public void acceleration();
	abstract public void speedlimit();
	public void normal()
	{
		System.out.println("normalmethod");
	}
	



}

class BMW extends Car
{

	@Override
	public void acceleration() {
		System.out.println("60kmph");
	}

	@Override
	public void speedlimit() {
       System.out.println("120kmph");		
	}
	


}

class Kia extends Car
{

	@Override
	public void acceleration() {
     System.out.println("40kmph");		
	}

	@Override
	public void speedlimit() {
	     System.out.println("200kmph");		
		
	}
	

}








public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Kia obj=new Kia();
    obj.acceleration();
    obj.speedlimit();
    
    BMW obj1=new BMW();
    obj1.acceleration();
    obj1.speedlimit();
    
	}

}
