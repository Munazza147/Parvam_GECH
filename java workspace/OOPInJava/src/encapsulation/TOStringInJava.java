package encapsulation;

class Person{
	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class TOStringInJava {
	public static void main(String[] args) {
		/* toString:
		 * =========
		 * * it is method that is used to display the objects
		 * */
		Person person = new Person("Mohan",23);
		System.out.println(person);
	}
}
