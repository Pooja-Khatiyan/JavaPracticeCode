package stringassignment;

public class ReverseWord {
	public static String reverseWord(String name) {
		if (name == null) {
			System.out.println("String is null,can't reverse");
			return "enter valid input";
		}
		int len = name.length();
		if (len == 0 || len == 1) {
			return name;
		} else {

			String rev = "";
			for (int i = len - 1; i >= 0; i--) {
				rev = rev + name.charAt(i);
			}
			return rev;
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseWord("Pooja"));
	}

}
