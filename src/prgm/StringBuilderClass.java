package prgm;

public class StringBuilderClass {

	public static void main(String[] args) {
		String str = "Java is my Frist Lang";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);

	}

}
