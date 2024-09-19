package inter;

public interface Bank {  // By default 100% abstraction
	
	public void roi();
	public void cc();
	default void savingAc() {
		System.out.println("To show the Saving Amount for user account");
	}

}
