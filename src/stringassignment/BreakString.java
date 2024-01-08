package stringassignment;

public class BreakString {
	public static void returnStringInSequence(String S) {
		String word[] = S.split(" ");
		int index = 0;
		for (int i = 0; i < word.length; i++) {
			System.out.println("value at index: " + index + " = " + word[i]);
			index++;
		}
	}

	public static void main(String[] args) {
//Write a program that breaks a whole string into small strings, and prints out its all values .(Hint: split, loop) .		

		returnStringInSequence("hey how are you");

	}

}
