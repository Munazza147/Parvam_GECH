package encapsulation;

class Student{
	private String name;
	private int age;
	private double marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}

public class EncapsulationInJava {
	public static void main(String[] args) {
		/*
		 * encapsulation:
		 * ==============
		 * Encapsulation is a mechanism that binding the data into a single unit
		 *	i,e making fields(state) as private and methods as public using 
		 *	getters and setters
		 * */
		Student std1 = new Student();
		std1.setName("Murthy");
		System.out.println(std1.getName());
		
		
	}
}
