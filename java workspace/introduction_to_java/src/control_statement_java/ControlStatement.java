package control_statement_java;

public class ControlStatement {
	public static void main(String[] args) {
		/*
		 * if, if else, else if and switch statement
		 * 
		 * if(condition){
		 * }
		 * 
		 * if(condition){
		 * }
		 * else{
		 * }
		 * 
		 * if(condition){
		 * }
		 * else if(condition){
		 * }
		 * else if(condition){
		 * }
		 * else{
		 * }
		 * 
		 * */
		//switch
		int day = 2;
		switch (day) {
			case 1: {
				System.out.println("Monday");
				break;
			}
			case 2: {
				System.out.println("Tuesday");
				break;
			}
			case 3: {
				System.out.println("Wednesday");
				break;
			}
			case 4: {
				System.out.println("Thursday");
				break;
			}
			case 5: {
				System.out.println("Friday");
				break;
			}
			case 6: {
				System.out.println("Saturday");
				break;
			}
			case 7: {
				System.out.println("Sunday");
				break;
			}
			default:
				System.out.println("Invalid day");
			}
		}
}
