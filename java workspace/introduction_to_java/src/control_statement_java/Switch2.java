package control_statement_java;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		int day =2;
		switch (day) {
			case 1 -> System.out.println("Monday");
			case 2 -> System.out.println("Tuesday");
			case 3 -> System.out.println("Wednesday");
			case 4 -> System.out.println("Thursday");
			case 5 -> System.out.println("Friday");
			case 6->System.out.println("Saturday");
			case 7 -> System.out.println("Sunday");
			default->System.out.println("Invalid day");
		}
		/*
		 * take user input integer
		 * check for weekdays and weekend using switch
		 * 1-5 weekdays and 6-7 weekend else invalid day
		 * */
		Scanner sc = new Scanner(System.in);
		int day1 = sc.nextInt();
//		switch (day1) {
//			case 1,2,3,4,5 -> System.out.println("Weekday");
//			case 6,7->System.out.println("Weekend");
//			default->System.out.println("Invalid day");
//		}
		String res= switch (day1) {
			case 1,2,3,4,5 -> "Weekday";
			case 6,7-> "Weekend";
			default->"Invalid day";
		};
		System.out.println("The result  is : "+res);
	}
}







