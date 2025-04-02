package interfaceInJava;


interface Animal{
	public void  makeSound();
}

class Dog implements Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}


public class InterfaceInJava {
	public static void main(String[] args) {
		/*
		 * Interface:
		 * ==========
		 * It is a blue print of the class 
		 * The methods in the interface by default abstract(does not contain body)
		 * from java 8 we can write default and static methods in interface
		 * if you don't know the complete complete implementation of the method
		 * 
		 * interface interface_name{
		 * 	//code
		 * }
		 * 
		 * interface Animal{
		 * 		public void makeSound();
		 * }
		 * */
		Dog dog = new Dog();
		dog.makeSound();
		
	}
}
