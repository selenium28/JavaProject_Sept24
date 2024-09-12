package oops;

public class StaticAndNonStatic {
	
	int a = 10;

	public static void main(String[] args) {
		System.out.println("Main method");
		stop();  // direct calling
		StaticAndNonStatic.display();  // Calling by using class name
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.abc();
		obj.add();
//		obj.display();  // The static method display() from the type StaticAndNonStatic should be accessed in a static way

	}

	public void add() {
		System.out.println("Non static add");
		int b = 20;
		System.out.println(a + b);
	}

	public static void stop() {
		System.out.println("Static Stop");
	}

	public void abc() {
		System.out.println("Non static ABC ");
	}

	public static void display() {
		System.out.println("Static Display");
	}

}
