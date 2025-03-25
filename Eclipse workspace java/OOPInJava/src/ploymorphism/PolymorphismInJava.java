package ploymorphism;

//1. method-overriding
class Person{
	public void walking() {
		System.out.println("The person is walking");
	}
}
class Mohan extends Person{
	public void walking() {
		System.out.println("Mohan is walking");
	}
}

//2. method - overloading
class Addition{
	public void add(int a, int b) {
		System.out.println("Addition is : "+(a+b));
	}
	public void add(int a, int b,int c) {
		System.out.println("Addition is : "+(a+b+c));
	}
}

public class PolymorphismInJava {
	public static void main(String[] args) {
		/*
		 * polymorphism:
		 * =============
		 * * poly-> many
		 * * morphism -> forms
		 * * it a mechanism that methods will perform a different actions 
		 *   based on the situation
		 *  1. method-oervloading(one class)
		 *  2. method-overriding(two class)
		 * */
		//1. method-overriding/dynamic- polymorphism/ runtime polymorphism
		//dynamic binding 
		Mohan mohan = new Mohan();
		mohan.walking();
		
		//2. method - overloading/compiletime polymorphism/sp/static binding
		Addition addition = new Addition();
		addition.add(10,20);
		addition.add(10,20,30);
		
	}
}
