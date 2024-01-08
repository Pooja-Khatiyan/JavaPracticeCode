package stringassignment;

public class PrintLastFirstChar {

	public static void main(String[] args) {
//Write a program that will  print out the last character and first character of a word.
		String word = "i love your voice";
		if (!word.isEmpty()) {
			char firstchar = word.charAt(0);
			char lastchar = word.charAt(word.length() - 1);
			System.out.println("Char At First Index: " + firstchar);
			System.out.println("Char At Last Index: " + lastchar);
		} else {
			System.out.println("String is empty");
		}

	}

}
