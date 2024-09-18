package inheri;

public class ConstructorConcept {

	public static void main(String[] args) {
		System.out.println("Main method");
		ConstructorConcept obj = new ConstructorConcept();
		obj.demo();

	}
	
	public void demo() {
		System.out.println("Demo - method");
	}
	
//	Constructor does no have return type
	public ConstructorConcept(){
		System.out.println("Constructor block");
	}
	
	{
		System.out.println("Blank Block");
	}
	
	static {
		System.out.println("Static Block");
	}

}
