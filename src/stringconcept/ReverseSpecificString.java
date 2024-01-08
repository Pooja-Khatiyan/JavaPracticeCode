package stringconcept;

public class ReverseSpecificString {

	static String result = "";

	public static boolean handleNullInput(String input) {

		return input == null;

	}

	public static String handleNoLoveInput(String input) {
		if (!input.toLowerCase().contains("voice")) {
		}
		return "Input string does not contain 'voice'";
	}

	public static String reverseWord(String word) {

		for (int i = word.length() - 1; i >= 0; i--) {
			result += word.charAt(i);

		}
		return result;

	}

	public static String reverseString(String input) {

		String[] str1 = input.split(" ");

		int len = str1.length;

		String str2 = "";

		for (int i = 0; i < len; i++) {

			if (str1[i].equalsIgnoreCase("voice")) {

				str2 += reverseWord("voice") + " ";

			}

			else {

				str2 += str1[i] + " ";

			}

		}

		return str2;

	}

	public static void main(String[] args) {

		/*
		 * Now I want to reverse the 'love' only and my expected output is
		 * 
		 * "I evol java coding."
		 */

		String input ="i love your voice";

		if (handleNullInput(input)) {

			System.out.println("Input String is null");

		}

		else {

			if (!input.toLowerCase().contains("voice")) {

				String expectedOutput2 = handleNoLoveInput(input);

				System.out.println(expectedOutput2);

			} else {

				String expectedOutput = reverseString(input);

				System.out.println(expectedOutput);

			}
		}
	}

}
