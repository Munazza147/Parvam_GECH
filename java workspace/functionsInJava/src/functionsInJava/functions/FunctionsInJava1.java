package functionsInJava.functions;

public class FunctionsInJava1 {
	//1. public function:
	// -> anywhere
	public void publicFunction() {
		System.out.println("This is publicFunction");
	}
	//2. private function
	//->within class
	private void privateFunction() {
		System.out.println("This is private Function");
	}
	
	//3. default function
	//within the package
	void defaultFunction() {
		System.out.println("This is Default function");
	}
	//4. protected function
	//within package and subclass in other package
	protected void ProtectedFunction() {
		System.out.println("This is Protected Function");
	}
	//5. static function
	// we can access by using class name
	public static void staticFunction() {
		System.out.println("This is static function");
	}
	
	public static void main(String[] args) {
		FunctionsInJava1 obj1 = new FunctionsInJava1();
		obj1.privateFunction();
		obj1.publicFunction();
		obj1.ProtectedFunction();
		FunctionsInJava1.staticFunction();
	}
}
