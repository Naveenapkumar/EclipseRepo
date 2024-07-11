package Oopspkg;

class Shape
{
	public void draw()
	{
		System.out.println("Output in parent class");
		
	}
	
}

class Circle extends Shape
{   @Override
	public void draw()
	{
		System.out.println("Output in derived class");
		super.draw();//used to call immediate parent class method
		
	}
	
}






public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Circle obj=new Circle();
    obj.draw();
	
	}

}
