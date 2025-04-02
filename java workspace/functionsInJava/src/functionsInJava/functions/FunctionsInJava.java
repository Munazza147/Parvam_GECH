package functionsInJava.functions;

public class FunctionsInJava {
	
	//2.
	public int add(int a, int b) {
		return a+b;
	}
	public void add2(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		/* 
		 * Functions/methods in java:
		 * ==========================
		 * <access_modifier> return_type function_name(parameters){
		 *			code
		 * }
		 * public void add(int a, int b){
		 * 	syso(a+b);
		 * }
		 * two:
		 * ===
		 * 1. built-in - next(),nextLine(),println(),equals()
		 * 2. user defined: 
		 * ================
		 * a. function return a value  not accepting parameter
		 * b. function return a value and accept a parameter
		 * c. function not return a value but accept a parameter
		 * d. function not returning a value also not accepting a parameter
		 * */
		FunctionsInJava obj1 = new FunctionsInJava();
		int res = obj1.add(19, 20);
		System.out.println("output is: "+res);
		obj1.add2(23, 23);
	
		FunctionsInJava1 obj2 = new FunctionsInJava1();
		//obj2.privateFunction();
	}
}







