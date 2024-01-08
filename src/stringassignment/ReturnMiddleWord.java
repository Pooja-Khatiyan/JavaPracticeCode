package stringassignment;

public class ReturnMiddleWord {
	public static void returnMiddleOne(String word) {
		String words[] = word.split(" ");
		if (words.length == 3) {
			System.out.println(words[1]);
		} else {
			System.out.println("String doesn'tcontain 3 words");
		}

	}

	public static void main(String[] args) {
// Assume that a string consists of 3 words, print out the middle one.		
returnMiddleOne("HOW ARE YOU");
		
	}

}
