package stringassignment;

public class ReturnIntegerForEmpty {

	public static int returnIntForEmpty(String s) {
		if (s.isEmpty()) {
			int i = -1;
			return i;
		}
		int j = s.indexOf("i");
		return j;

	}

	public static void main(String[] args) {
		System.out.println(returnIntForEmpty("java coding"));

	}

}
