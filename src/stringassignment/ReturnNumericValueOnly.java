package stringassignment;

public class ReturnNumericValueOnly {
	public static void returnNum(String S) {
		String s[] = S.split(" ");
		System.out.println(s[4] + " " + s[9]);
	}

	public static void main(String[] args) {
// get only numeric part from this String:String s = "your transaction id is: 12345 and reference id is 34567"
		returnNum("your transaction id is: 12345 and reference id is 34567");

	}

}
