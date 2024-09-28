package excep;

public class ExceptionMultipleHandling {

	public static void main(String[] args) {
		
		
		try {
			int i[] = new int[2];
			i[3] = 10;
			System.out.println(i[3]);
		} catch (ArithmeticException arth) {
			System.out.println("Exception Handled");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Exception Handled: " +e);
		} catch (Exception e) {
			
		}
		
		System.out.println("remaining code");
		
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} finally {
			System.out.println("Finally Block");
		}
		

	}

}
