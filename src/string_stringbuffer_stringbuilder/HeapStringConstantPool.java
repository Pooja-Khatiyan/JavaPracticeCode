package string_stringbuffer_stringbuilder;

public class HeapStringConstantPool {

	public static void main(String[] args) {
		String s1 = new String("you can not change me");
		String s2 = new String("you can not change me");
		System.out.println(s1 == s2);
		String s3 = "you can not change me";
		System.out.println(s1 == s3);
		String s4 = "you can not change me";
		System.out.println(s3 == s4);
		String s5 = "you can not" + " change me";// operation perform at compile time
		System.out.println(s4 == s5);
		String s6 = "you can not ";
		// one variable + one constant resolve at run time
		String s7 = s6 + "change me";
		System.out.println(s4 == s7);
		// every final variable will be replaced by compiler only at compile time.
		final String s8 = "you can not ";
		String s9 = s8 + "change me";
		System.out.println(s4 == s9);
	}

}
