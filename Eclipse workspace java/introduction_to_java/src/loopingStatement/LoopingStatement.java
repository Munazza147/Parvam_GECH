package loopingStatement;

public class LoopingStatement {
	public static void main(String[] args) {
		/*
		 * for loop - 
		 * for(ini;condi;inc/drc){
		 * }
		 * for(int i =0;i<=6;i++){
		 * }
		 * while loop - 
		 * ini
		 * while(condition){
		 *		code
		 *		inc/dec
		 * }
		 * 
		 * int i=0;
		 * 
		 * while(i<9){
		 * syso("i: "+i);
		 * i++;
		 * }
		 * do-while loop
		 * ini
		 * do{
		 * code
		 * inc/dec;
		 * }while(condition);
		 * 
		 * for each loop
		 * =============
		 * for(<datatype> variable_name : collection){
		 * 
		 * }
		 * */
		
		int [] arr= {1,2,3,4,5};		
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
}
