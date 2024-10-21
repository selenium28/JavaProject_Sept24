package prgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringReverseClass {

	public static void main(String[] args) {
		String str = "My First Lang Java";
		
		List<String> sr = new ArrayList<String>();
		
		String[] part = str.split("\\.");
		
		for(String st : part) {
			if (!sr.isEmpty()) {
				sr.add(str);
			}
		}
		Collections.reverse(sr);
		String.join(" ", part);
		System.out.println(sr);
	}

}
