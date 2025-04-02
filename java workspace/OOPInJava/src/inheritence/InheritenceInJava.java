package inheritence;

//1. single level
class Parent{
	int pData = 100;
	public void parentMethod() {
		System.out.println("This isparent method");
	}
}
class Child2 extends Parent{
	int cData = 200;
	public void childMethod() {
		System.out.println("This is Child method");
	}
}


public class InheritenceInJava {
	public static void main(String[] args) {
		/*
		 * Inheritance:
		 * ============
		 * * extending the properties of parent class to child class
		 * * properties(state and actions)
		 * types:
		 * ======
		 * 1. single level
		 * 2. multilevel 
		 * 3. heirarchical 
		 * 4. hybrid
		 * 5. multiple  -> not possible
		 * */
		Child2 child2 = new Child2();
		child2.childMethod();
		child2.parentMethod();
		System.out.println(child2.cData);
		System.out.println(child2.pData);
		
	
	}
}
