package introduction_to_java.first_program;

import java.util.Scanner;

public class UnserInputValues {
	public static void main(String[] args) {
		int stdAge = 0;
		/*
		 * byte = nextByte();
		 * short = nextShort();
		 * int = nextInt();
		 * float = nextFloat();
		 * double = nextDouble();
		 * bolean = nextBoolean();
		 * */
		System.out.println("Enetr the student age: ");
		Scanner sc = new Scanner(System.in);
		stdAge=sc.nextInt();
		System.out.println("the age of student is : "+stdAge);
		
		sc.nextLine();
		
		//character
		System.out.println("Enter your gender: ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("gender is : "+ gender);
		
		
	}
}
