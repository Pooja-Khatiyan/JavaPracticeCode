package string_stringbuffer_stringbuilder;

public class DifferenceBetweenEquals {

	public static void main(String[] args) {
		String s1 = new String("Pooja");
		String s2 = new String("Pooja");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println("----------------");
		StringBuffer sb1 = new StringBuffer("Pooja");
		StringBuffer sb2 = new StringBuffer("Pooja");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}

}
