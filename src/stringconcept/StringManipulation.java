package stringconcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
//1) to know the length of the String
		String s = "Hi this is my java code and i am so happy";
		System.out.println(s.length());
		System.out.println("LI" + " = " + 0);
		System.out.println("HI" + " = " + (s.length() - 1));

//2) to know char at specific index
		System.out.println(s.charAt(19));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(40));
		// System.out.println(s.charAt(41));//StringIndexOutOfBoundsException
		// System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException

//3)to know index of specific character
		System.out.println(s.indexOf("H"));
		System.out.println(s.indexOf("j"));
		System.out.println(s.indexOf("i"));// 1st i occurrence
		System.out.println(s.indexOf("i", s.indexOf("i") + 1));// 2nd i occurrence
		System.out.println(s.indexOf("i", s.indexOf("i", s.indexOf("i") + 1) + 1));// 3rd i occurrence
		System.out.println(s.indexOf("i", s.indexOf("i", s.indexOf("i", s.indexOf("i") + 1) + 1) + 1));// 4th i
																										// occurrence
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("Pooja"));// -1
		System.out.println("------");
// through loop 
		int index = -1; // Initialize index to 0
		while ((index = s.indexOf("i", index + 1)) != -1) {
			System.out.println("Found 'i' at position: " + index);
		}

		System.out.println("-------");

//	use case in selenium /automation

		String msg = "Welcome admin";
		// if (msg.indexOf("admin")>0) {
		if (msg.indexOf("admin") != -1) {
			System.out.println("admin is there");
		} else {
			System.out.println("validation fail admin is not there");
		}

//4)trim method-- trim the space from corners

		String s1 = "   hello selenium  ";
		System.out.println(s1.trim());

//5)replace method		
		String dob = "21-05-1991";
		dob = dob.replace("-", "/");
		System.out.println(dob);

		String s2 = "   Hello           world            ";
		System.out.println(s2.replace(" ", "").trim());

//6)toLowercase & toUppercase
		String s3 = "This is my code";
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());

//7)comparison	method--- return boolean
		String s4 = "Hello Selenium";
		String s5 = "Hello Selenium";
		String s6 = "hello selenium";
		String s66 = "Hello selenium";
		String s7 = " Hello Selenium";// gap can't be ignore only sensitivity of char are ignore
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s66));
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s6.equalsIgnoreCase(s7));

//8)contain---return boolean
		System.out.println(s3.contains("code"));
		System.out.println(s3.contains("java"));

//9)sub-string method-- return string
		String loop = "I am the happiest girl in the world";
		System.out.println(loop.substring(9));// 10th index is beginning till the length of string
		System.out.println(loop.substring(14, loop.length()));
		System.out.println(loop.substring(loop.indexOf("in") + 3, loop.length()));

//10)split
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String[] lg = lang.split("_");
		System.out.println(Arrays.toString(lg));
		System.out.println(lg[0]);
		System.out.println(lg[1]);
		System.out.println(lg[2]);
		System.out.println(lg[3]);
//System.out.println(lg[4]);//ArrayIndexOutOfBoundsException

//FAMOUS INTERVIEW QUESTION
		String pop = "xXHelloSeleniumxXXTestingXxXAutomationXXxXJava";
		String[] p = pop.split("xX");
		System.out.println(p[0]);// blank--empty--nothing
		System.out.println(p[1]);
		System.out.println(Arrays.toString(p));
//SHOULD AVOID WRITTING IN THIS WAY AS MULTIPLE SPLIT IS THERE--split once & use multiple tym
		String Empinfo = "Ravi;Sharma;IBM;Pune;India;QA";
		System.out.println(Empinfo.split(";")[0]);// MULTIPLE SPLIT
		System.out.println(Empinfo.split(";")[1]);
		System.out.println(Empinfo.split(";")[2]);

		System.out.println("---------------");
		String g = "Pooja";
		System.out.println(g.concat("2"));// create new obj without reference as string is immutable
		System.out.println(g);
//IMPORTANT INTERVIEW QUESTIONS
		String domain = "test.automation.python.java";
		// String dm[] = domain.split(".");//ArrayIndexOutOfBoundsException
		String dm[] = domain.split("\\.");
		System.out.println(dm[0]);

		String data = "test|automation|python|java";
		String[] d = data.split("\\|");
		System.out.println(d[1]);

		String foo = " I love java coding";
		// required o/p = I love "java" coding

		System.out.println("I love \"java\" coding");
//required o/p = I love 'java' coding
		System.out.println("I love 'java' coding");
//required o/p= "I love java coding"
		System.out.println("\"I love java coding\" ");

//FOR XPATH CREATION
//required o/p "//input[@name='Tom'"
		String x = getxpath("Tom");
		System.out.println(x);
	}

	public static String getxpath(String empname) {
		String xpath = "//input[@name= ' " + empname + " ']";
		return xpath;
	}

}
