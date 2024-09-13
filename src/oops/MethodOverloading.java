package oops;

public class MethodOverloading {
	
//	Method Overloading - When method name is same with diff. input paramters within the 
//	class is known as MethodOverloading in Java

	public static void main(String[] args) {
		System.out.println("Main method");

	}
	
//	Can we overload main method in java?
//	Yes we can but this is not a good practice.
//	public static void main() {
//		System.out.println("Main method");
//	}
	
	public void display() {  // zero parameter
		System.out.println("Display method with zero parameter");
	}
	
	public void display(int num) {  // one parameter
		System.out.println("Display method with one parameter");
	}
	
	public void display(int a, int b) {  // two parameter
		System.out.println("Display method with two parameter");
	}
	
	public void display(double d) {  // one parameter
		System.out.println("Display method with one parameter");
	}


}
