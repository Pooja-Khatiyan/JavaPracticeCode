package stringassignment;

public class ReturnLastHalf {
	public static String returnHalf(String word) {
		int length = word.length();
		if (length < 2) {
			return word;
		}
		int middle = length / 2;
		return word.substring(middle);

	}

	public static void main(String[] args) {
		System.out.println(returnHalf("i love java coding"));

	}

}
