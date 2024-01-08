package stringconcept;

//reverse the order of complete String
public class RverseTheOrder {

	public static void main(String[] args) {
		String original = "I am the best";
		String[] word = original.split(" ");
		for (int i = word.length- 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}

	}

}
