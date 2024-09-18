package str;

public class StringClass {

	public static void main(String[] args) {
		String str = new String("Java");   // 2 object will create in Java memory - 1 is in heap area & 1 is in SCP.
		String str2 = "Java";
		System.out.println(str2);
		String str3 = new String("Java");
		String str4 = "Selenium";
		String str5 = new String("Testing");
		String str6 = "Testing";
		String str7 = " Testing ";
		String str8 = str7.trim();
		
//		== -> It will compared with address
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str6 == str7);
		System.out.println(str5.equals(str7));
		
		System.out.println(str8.length());
		

	}
	
	

}
