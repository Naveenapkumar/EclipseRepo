package Oopspkg;


class Animal
{
	public void animalmethod()
	{
		System.out.println("Animal method");
	}


}

class Lion extends Animal
{
	public void lionmethod()
	{
		System.out.println("Lion method");
	}


}
class Tiger extends Animal
{
	public void tigermethod()
	{
		System.out.println("Tiger method");
	}


}
public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Lion obj=new Lion();
    obj.animalmethod();
    obj.lionmethod();
    Tiger obj1=new Tiger();
    obj1.tigermethod();
    
	}

}
