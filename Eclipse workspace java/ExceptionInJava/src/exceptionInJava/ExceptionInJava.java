package exceptionInJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava {
	
	// recursion
	// Error
	//	public static void display() {
	//		display();
	//	}
	
	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Exception in Java:
		 * ==================
		 * * there is a unwanted or un-expected event occur in the program.
		 * * when ever there is exception the normal flow will stops.
		 * 
		 * 2 types:
		 * ========
		 * 1. checked exception(compile time) - FileNotFoundException(2 ways)
		 * 2. unchecked exception(run time) - arrayIndexOutBoundException(1 way)
		 * 
		 * Error:
		 * ======
		 * * it is a problem where the programmer cann't handle it ex: stackoverflow  error
		 * */
		//ERROR
		//ExceptionInJava.display();
		
		
		//checked exception
		//1. try catch
//		try {
//			PrintWriter printWriter = new PrintWriter("abc.txt");
//			printWriter.println("Hello World");
//			System.out.println("Hello world");
//			printWriter.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e);
//		}
		
		//2.throws
		PrintWriter printWriter = new PrintWriter("abc.txt");
		printWriter.println("Hello World");
		System.out.println("Hello world");
		printWriter.close();
		
		
	}
}
