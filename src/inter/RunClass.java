package inter;

public class RunClass {

	public static void main(String[] args) {
		ICICIBank objICICIBank = new ICICIBank();
		objICICIBank.cc();
		objICICIBank.savingAc();
		
//		Bank obj = new Bank(); Cannot instantiate the type Bank
		
		Bank objBank = new ICICIBank();   // type casting

	}

}
