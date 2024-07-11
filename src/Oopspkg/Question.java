package Oopspkg;

class Members
{
	String name;
	int age;
	long phonenum;
	String address;
	int salary;
	public void printdetails() {
	System.out.println("Name of the member:"+name+"Age is:"+age+"Phone number"+phonenum+"Address:"+address+"Salary"+salary);
	

	}
}
//Q:create a class named member having the datamemebrs name,age,phonenum,address,salary.
//it also has a method printdetails which print all the details of memebrs
//create two class employee and manager inherits the memebr class
//employee and manager class have datamember specialization and department resp
//assign values to an employee and manager by making an obj of both thes classes and print the same

class Employee extends Members
{
	String specialization;

}


class Department extends Members
{
	String department;

}


public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee();
		Department obj2=new Department();
		obj1.name="Naveena";
		obj1.age=20;
		obj1.phonenum=9874521300L;
		obj1.address="testaddress";
		obj1.salary=35000;
		obj1.printdetails();
		System.out.println(obj1.specialization="Developmnet");
		
		Department ob=new Department();
		ob.name="Naveena";
		ob.age=20;
		ob.phonenum=9874521300L;
		ob.address="testaddress";
		ob.salary=35000;
		ob.printdetails();
		System.out.println(ob.department="testdepartment");

}
}
