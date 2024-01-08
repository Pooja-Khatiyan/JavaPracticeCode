package stringassignment;

public class ReverseWordAnotherWay {

	public static void main(String[] args) {
		String str = "I am the Best";
		String[] s = str.split(" ");
		String s1 = s[0];
		String s2 = s[1];
		String s3 = s[2];
		String s4 = s[3];

		System.out.println(str);

		System.out.println(s4 + " " + s3 + " " + s2 + " " + s1);

	}

}
