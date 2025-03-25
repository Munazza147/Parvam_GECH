package exceptionInJava;

public class ExceptionInJava3 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Inavlid age");
		}
		else {
			System.out.println("Your age is : "+age);
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 * finaly block:
		 * =============
		 * * This will execute even if the exception occur or not
		 * * where we have to write the closing code like 
		 *   db connection,file close
		 * */
		
//		try {
//			System.out.println(10/0);
//		} finally {
//			System.out.println("This is finally block");
//		}
		
//		try {
//			System.out.println(10/0);
//		}catch (Exception e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("This is finally block2");
//		}
		
		
		/*
		 * throw :
		 * =======
		 * it is used to throw the exception
		 * */
		
//		try {
//			validate(23);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		
	}
}
