package stringconcept;

//String -it is a default class already there in java
public class User {

	public static void main(String[] args) {
//there are 2 ways to create String
//1)array literals
		String s1 = "Selenium";// 1 obj in scp

//2)new keyword
		String s2 = new String("Hello");// 2 obj --1 in scp --1 in heap

		String s3 = "Hello";// no obj
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		String s4 = new String("Hello");// 1 obj in heap
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s4));
		String s5 = "Hello";// no object
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5));
		String s6 = "hello";// 1 obj in scp
		String s7 = new String("Pooja");// 2 obj --1 in scp --1 in heap
		String s8 = s7.intern();// to provide reference to already existing obj
		System.out.println(s7 == s8);// 1 is in heap & another is in scp
//we can have duplicate obj inside the heap, but inside scp is not allowed
//string are immutable
		String st = "Hello";
		System.out.println(st + "Selenium");
		System.out.println(st);

		String st1 = "Hello";
		st1 = st1 + "Selenium";
		System.out.println(st1);
		String st2 = "Hello";
		System.out.println(st2 + 100);
		System.out.println(st2 + 200);
//Literals are only for String not for String buffer or String builder.		
		// StringBuilder sb1 = "Testing";//Type mismatch: cannot convert from String to
		// StringBuilder
//StringBuilder are mutable it upgrade the value instead of creating new entity i.e for manipulation they are preferred 
//over String.
		StringBuilder sb = new StringBuilder("Testing");
		System.out.println(sb);
		System.out.println(sb.append("Automation"));
		System.out.println(sb);
		System.out.println(sb.append("100"));
		// StringBuilder sb2 = sb.append(100);
//In Java, when you use the + operator for string concatenation, it creates a new string object instead of modifying the existing string.
//when you do something like sb + "100", it creates a new string by converting sb to a string and concatenating it with "100", but it doesn't modify the sb object itself. If you want to modify the StringBuilder object, you should always use the append method.
//If you want to add 100 and 200, try this:
		sb.append("100").append("200");
		System.out.println(sb + "200");
		System.out.println(sb.append(1));
		System.out.println(sb.append("pooja"));
		System.out.println(sb.length());

		StringBuilder sb1 = new StringBuilder("Testing");
		System.out.println(sb1 + "2");// it creates a new string by converting sb to a string
		System.out.println(sb1);
		System.out.println(sb1.append(2));
		System.out.println(sb1);
	}

}
