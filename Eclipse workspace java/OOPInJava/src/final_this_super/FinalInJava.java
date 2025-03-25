package final_this_super;

final class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	
}

public class FinalInJava {
	public static void main(String[] args) {
		/*
		 * final -> we can't change the value
		 * variables,method,class
		 * variables --> the variable value cannot be changed
		 * method --> we cannot override
		 * final class --> we cannot extends that class
		 * */
		
		final double PI = 3.14;
		System.out.println(PI);
		//PI = 4.14;
		System.out.println(PI);
	}
}
