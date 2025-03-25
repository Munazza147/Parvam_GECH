package abstraction;

//1. interface
interface Animal{
	public void eat();
}

class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println("Lion will eat meat");
	}
	
}

//2. abstract class
abstract class Vehicle{
	//abm
	public abstract void start();
	
	//non-abm
	public void stop() {
		System.out.println("The Vehicle is stopped");
	}
}

class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car starts with key");
	}
	
}


public class Abstraction {
	public static void main(String[] args) {
		/*
		 * Abstraction:
		 * ============
		 * is is a process of hiding the implementation and
		 * showing only the essential resources
		 * 2 ways:
		 * =======
		 * 1. Interface(100%)
		 * 2. abstract class(0-100%)
		 * */
		
		Lion lion = new Lion();
		lion.eat();
		
		Car car = new Car();
		car.start();
		car.stop();
	}
	
	
}
