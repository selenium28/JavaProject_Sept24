package collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("Shivani");
		array.add("Java");
		array.add("Dev");
		array.add("Selenium");
		System.out.println(array);
		
		array.add(0, "Prachi");
		System.out.println(array);
		
		System.out.println(array.get(2));
		
		array.set(0, "Updated");
		System.out.println(array);
		
		array.remove(0);
		System.out.println(array);
		
		System.out.println(array.size());
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

}
