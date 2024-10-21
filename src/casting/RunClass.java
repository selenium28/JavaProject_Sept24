package casting;

public class RunClass {

	public static void main(String[] args) {
		Animal animal = new Dog(); // Upcasting
		animal.makeSound(); 

		Dog dog = (Dog) animal; // downcasting
		dog.color();

	}

}
