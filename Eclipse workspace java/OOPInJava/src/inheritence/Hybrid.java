package inheritence;

interface newInterface{
	public void display();
}

class ParentClass2{
	public void display2() {
		System.out.println("This isparent class");
	}
}

class ChildClass1 extends ParentClass2 implements newInterface{

	@Override
	public void display() {
		System.out.println("This is method from interface");
		
	}
}

public class Hybrid {
	public static void main(String[] args) {
		ChildClass1 childClass1 =new ChildClass1();
		childClass1.display();
		childClass1.display2();
	}
}
