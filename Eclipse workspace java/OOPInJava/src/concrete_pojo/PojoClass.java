package concrete_pojo;

class Student{
	private String name;

	
	public Student() {
		super();
	}


	public Student(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}

public class PojoClass {
	public static void main(String[] args) {
		/*
		 * POJO Class:
		 * ===========
		 * * plain old java object(POJO)
		 * rules:
		 * ======
		 * 1. The class is should not extends or implements any 
		 *  class or interface
		 * 2. Every fields(states/properties) should be private
		 * 3. All-args Constructor
		 * 4. No-args Constructor
		 * 5. toString()
		 * 6. Getter and setter public methods
		 * */
		
		Student std= new Student("Murthy");
		System.out.println(std);
	}
}
