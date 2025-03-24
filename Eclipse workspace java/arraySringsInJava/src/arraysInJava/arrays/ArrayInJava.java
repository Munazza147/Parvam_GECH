package arraysInJava.arrays;

public class ArrayInJava {
	public static void main(String[] args) {
		/*
		 * Arrays in java
		 * 
		 * * If we want to store a multiple values of the same datatypes 
		 * we have to go for the array
		 * 
		 * how to declare the array:
		 * =========================
		 * <datatype> [] array_name = new <datatype>[size];
		 * 
		 * int [] array1 = new int[4];
		 * 
		 * how to declare and initialize the array:
		 * ========================================
		 * int [] arr = {1,2,3,4,5};
		 * 
		 * types:
		 * ======
		 * 1. 1D -> single row.
		 * int [] array1 = new int[4];
		 * 2. 2D -> in the form of table.
		 * int [][] array1 = new int[4][3];-->4*3->12
		 * 
		 * */
		
		int[] arr = new int[5];
//		arr[0]=30;
//		arr[1]=10;
//		arr[2]=34;
//		arr[3]=40;
//		arr[4]=90;
		//arr[5]=100;--> array index out of bound exception
		
		for(int i=0;i<=4;i++) {
			arr[i] = 10;
		}
		for(var i : arr) {
			System.out.print(i+" ");
			//System.out.println(i+" ");
		}
		
		/* write a program to take the user input values 
		 * and store inside array and just print it */
		
	}
}
