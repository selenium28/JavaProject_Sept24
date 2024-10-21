package prgm;

public class ReverseStringBuilder {

	public static void main(String[] args) {
		String str = "Java is My First Language";
		String reversedWords = reverseWords(str);
		System.out.println(reversedWords);
	}

	public static String reverseWords(String input) {
		
		// Split the input string into words
		String[] words = input.split(" ");

		//StringBuilder to hold reverse words
		StringBuilder reversed = new StringBuilder();

		// loop through each word
		for (String word : words) {
			// reverse the current word
			String reversedWord = new StringBuilder(word).reverse().toString();
			reversed.append(reversedWord).append(" "); 
		}
		// trim the final string to remove extra space
		return reversed.toString().trim();
	}

}
