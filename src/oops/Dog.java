package oops;

public class Dog {

	public static void main(String[] args) {
		System.out.println("Main method");
		// When we create an object, all the non-statics methods will go in dog Object. 
		// Dog - Class name
		// dogObject - ref variable
		// new - keyword
		// Dog() - constructor
		// = new Dog();  - object
		Dog dogObject = new Dog();
		dogObject.eat();
		dogObject.sleep();
		
	}

	public void eat() {
		System.out.println("Eating");
	}

	public void sleep() {
		System.out.println("Sleeping");
	}

}
