package stringassignment;

public class ReturnFirstHalf {
	public static String firstHalf(String word) {
		int length = word.length();
		if (length < 2) {
			return word;
		}
		int middle = length / 2;
		return word.substring(0, middle);
	}

	public static void main(String[] args) {
		System.out.println(firstHalf("i like java coding"));
	}

}
