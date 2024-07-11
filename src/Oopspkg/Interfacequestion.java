package Oopspkg;

class Monkey {
 public void jump() {
     System.out.println("Monkey is jumping.");
 }

 public void bite() {
     System.out.println("Monkey is biting.");
 }
}

interface BasicAnimal {
 void eat();
 void sleep();
}

class Human extends Monkey implements BasicAnimal {

 public void speak() {
     System.out.println("Human is speaking.");
 }

 @Override
 public void eat() {
     System.out.println("Human is eating.");
 }

 @Override
 public void sleep() {
     System.out.println("Human is sleeping.");
 }

 public static void main(String[] args) {
     Human obj = new Human();
     obj.jump();
     obj.bite();
     obj.speak();
     obj.eat();
     obj.sleep();
 }
}










public class Interfacequestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
