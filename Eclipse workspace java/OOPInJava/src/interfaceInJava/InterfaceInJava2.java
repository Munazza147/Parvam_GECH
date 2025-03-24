package interfaceInJava;

interface Interface1{
	public void method();
	public default void defaultMethod(){
		System.out.println("This is default method in interface");
	}
	public static void staticMethod(){
		System.out.println("This is static method in interface");
	}
}

class Child1 implements Interface1{

	@Override
	public void method() {
		System.out.println("This is Method");
	}
	
}


public class InterfaceInJava2 {
	/*
	 * default and static method inside interface
	 * */
	
	public static void main(String[] args) {
		Child1 child1= new Child1();
		child1.method();
		child1.defaultMethod();
		Interface1.staticMethod();
	}
}
