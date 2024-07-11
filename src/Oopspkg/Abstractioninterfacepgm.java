package Oopspkg;

interface Car1
{
	public void Acceleration();
	public void speedlimit();


}

class Maruti implements Car1
{

	@Override
	public void Acceleration() {
System.out.println("Maruti acceleraion");		
	}

	@Override
	public void speedlimit() {
		System.out.println("Maruti speedlimit");		
		
	}
	

}

class Mahindra implements Car1
{

	@Override
	public void Acceleration() {
System.out.println("Mahindra acceleration");		
	}

	@Override
	public void speedlimit() {
		System.out.println("Mahindra speedlimit");		
		
	}
	

}




public class Abstractioninterfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Maruti obj=new Maruti();	
obj.Acceleration();
obj.speedlimit();
Mahindra obj1=new Mahindra();
obj1.Acceleration();
obj1.speedlimit();
	}

}
