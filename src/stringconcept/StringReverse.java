package stringconcept;

//WAF=name : reverseString
//Parameter: String
//Return Type: String
public class StringReverse {
//Interact with interviewer what to return when null,when blank
	public static String reverseString(String str) {
// for null check---should be written on top

		if (str == null) {
			System.out.println("String is null,can't reverse, please enter the right value");
			// return null;
			return "String is null";
			// return "-1";
		}
// blank check

		if (str.isBlank()) {
			System.out.println("String is having blank space ");
			return str;
		}

//if(str.isEmpty()) {//it is not solving blank issue
//System.out.println("string is empty no blank");
//		}
// length check
		int len = str.length();
		if (len == 1 || len == 0) {
			return str;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;

	}

	public static void main(String[] args) {
//tcs		
		System.out.println(reverseString("I am the best"));
		System.out.println(reverseString("Selenium Automation"));
		System.out.println(reverseString("12345"));
		System.out.println(reverseString("T"));
		System.out.println(reverseString(""));
		// System.out.println(reverseString(" "));
		System.out.println(reverseString(null));

	}

}
