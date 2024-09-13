package oops;

public class GlobalVariableAndLocalVariable {
	public static int m = 100;  // static Global Variable  -- Scope of the global variables within the class
	String name = "Java";   // non-static Global Variable

	public static void main(String[] args) {
		int b = 200;
		int c = 300;
		
		GlobalVariableAndLocalVariable obj = new GlobalVariableAndLocalVariable();
		
		System.out.println(b+c);
		System.out.println(c+m);
		System.out.println(obj.name);

	}
	
	public void add() {
		int a = 400;  // Local variable - Scope of the local variable within the method
		System.out.println(m+a);
		
	}
	
	public void display() {
//		System.out.println(a);  // a cannot be resolved to a variable
		int a = 50;
		System.out.println(a);
	}

}
