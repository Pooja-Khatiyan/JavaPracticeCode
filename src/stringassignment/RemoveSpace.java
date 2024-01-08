package stringassignment;

public class RemoveSpace {

	public static void main(String[] args) {
// “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		String s = "   Hello        Everyone      ";
		System.out.println(s.trim().replace(" ", ""));

	}

}