package string_stringbuffer_stringbuilder;

public class String_StringBufferDifference {

	public static void main(String[] args) {
		String s = new String("Pooja");
		s.concat("Khatiyan");
		System.out.println(s);
		System.out.println("---------------");
		StringBuffer sb = new StringBuffer("Pooja");
		sb.append("Khatiyan");
		System.out.println(sb);
	}

}
