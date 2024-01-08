package stringassignment;

public class ContainsWord {
	public static boolean isContain(String word) {
		boolean flag;
		if (word.contains("look")) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
//Write a program to verify a word or a character contained in the sentence.

		System.out.println(isContain("don't look at me"));
	}

}
