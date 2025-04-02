package arraysInJava.arrays;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		/* write a program to take the user input values  include 
		 * size and store inside array and just print.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size = sc.nextInt();
		int [] arr = new int [size];//5
		
		System.out.println("Enter the values for array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" th element: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are: ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		sc.close();
		
		/* write a program to take the user input values in character
		 * include size and store inside array and just print.*/
	}
}
