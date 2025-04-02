package interfaceInJava;

interface A{
	public void method();
}
interface B{
	public void method();
}

class Child implements A,B{

	@Override
	public void method() {
		System.out.println("This is method from A and B interface");
	}

//	@Override
//	public void methodB() {
//		System.out.println("This is method B");
//		
//	}
//
//	@Override
//	public void methodA() {
//		System.out.println("This is Method A");
//	}
	
}


public class InterfaceInJava1 {
	public static void main(String[] args) {
		Child child = new Child();
//		child.methodA();
//		child.methodB();
		child.method();
	}
}
