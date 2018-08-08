package chapter3.strings;

public class ConcatString {

	public static void main(String[] args) {
		String start = "AniMal    ";
		String trimmed = start.trim();
		System.out.println(trimmed);
		
		String lowercase = trimmed.toLowerCase();
		System.out.println(lowercase);
		
		String result = lowercase.replace("a", "A");
		System.out.println(result);
	}

}
