package stringassignment;

public class ComapreString {
	public static String word(String str1) {
		return str1;
	}

	public static String words(String str2) {
		return str2;
	}

	public static void main(String[] args) {
		String s = word("hello java");
		String t = words("Hello Java");
		boolean areEqual = s.equals(t);
		// boolean areEqual = s.equalsIgnoreCase(t);
		if (areEqual) {
			System.out.println("Two String Are Equal");
		} else {
			System.out.println("Two String Are Different");
		}

	}

}
