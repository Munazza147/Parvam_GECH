package inheritence;

class grandParentClass{
	public void grandParentMethod() {
		System.out.println("This is Grand Parent Method");
	}
}

class ParentClass extends grandParentClass{
	public void parentMethod() {
		System.out.println("This is Parent Method");
	}
}

class ChildClass extends ParentClass{
	public void childMethod() {
		System.out.println("This is child Method");
	}
}


public class Multilevel {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.grandParentMethod();
		childClass.parentMethod();
		childClass.childMethod();
	}
}
