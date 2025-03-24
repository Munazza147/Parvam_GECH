package stringInJava;

public class StringsInJava2 {
	public static void main(String[] args) {
		/*
		 *Strings methods: 
		 *================
		 *1. equals
		 *2. ==
		 *3. compareTo
		 *4. contact
		 *5. touppercase
		 *6. tolowercase
		 *7. trim
		 *8. startswith
		 *9. endswith
		 *10. strip
		 *11. equalsignorecase
		 *12. isBlank()
		 */
		String str1 = new String("Hello World");
		String str2 = new String("hello world");
		//1. equals
		System.out.println("equals: "+str1.equals(str2));
		//2. equalsignorecase
		System.out.println("equalsIgnorecase: "+str1.equalsIgnoreCase(str2));
		//3. ==
		System.out.println(" == : "+str1==str2);
		//4. concat
		System.out.println(str1.concat(" ").concat(str2).concat("hi"));
		//5. touppercase
		System.out.println(str1.toUpperCase());
	}
}
