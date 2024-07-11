package Questions;

import Oopspkg.Accessmodifiers;

class Vehicle extends Accessmodifiers
{
	public void drive() 
	
	{
		
		System.out.println("This is vehicle class method");
	}
}

class Car extends Vehicle
{   @Override
	public void drive()
	{
		System.out.println("Repairing a car");
		super.drive();
	}


}




public class Inheritancequestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.drive();

	}

}
