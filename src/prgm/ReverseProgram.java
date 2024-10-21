package prgm;

public class ReverseProgram {

	public static void main(String[] args) {
		
		String str = "Java";
		String revStr = "";
		char ch;
		
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			revStr = ch+revStr;
		}
		System.out.println("Reverse String: " +revStr);
	}

}
