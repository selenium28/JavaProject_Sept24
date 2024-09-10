package core;

public class ArrayConcept {

	public static void main(String[] args) {
		
//		Array - To store similar data type in array variable
//		a[] - array of variable
		int a[] = new int[8];
		a[0] = 10;
		a[1] = 20;
		a[2] = -30;
		a[3] = 40;
		a[4] = 50;
//		a[5] = 50;      // ArrayIndexOutOfBoundsException:
		
		System.out.println(a[3]);
//		length -> length is the property of array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		double d[] = new double[10];
		

	}

}
