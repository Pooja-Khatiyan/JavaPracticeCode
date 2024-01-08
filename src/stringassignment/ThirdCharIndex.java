package stringassignment;

public class ThirdCharIndex {
	public static int indexOfThirdChar(String line) {
		int n1 = line.indexOf("e");
		int n2 = line.indexOf("e", line.indexOf("e") + 1);
		int n3 = line.indexOf("e", line.indexOf("e", line.indexOf("e") + 1) + 1);
		return n3;

	}

	public static void main(String[] args) {
//Write a program to get the 3rd  “ e “ of the string 		
		System.out.println(indexOfThirdChar("Welcome to Neeven A L"));

		String s = "i like your voice";
		int index = -1; // Initialize index to 0
		while ((index = s.indexOf("i", index + 1)) != -1) {
			System.out.println("Found 'i' at position: " + index);
		}

	}

}
