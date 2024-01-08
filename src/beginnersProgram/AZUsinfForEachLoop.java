package beginnersProgram;

public class AZUsinfForEachLoop {

	public static void main(String[] args) {
		char [] uppercasechars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char [] lowercasechars ="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char [] digitchars ="0123456789".toCharArray();
		for(char ch : uppercasechars)
		{
			System.out.println(ch + " = " + (byte)ch); 
	    }
		for(char ch : lowercasechars)
		{
		System.out.println(ch + " = " + (byte)ch);
		}
		for (char ch : digitchars )
		{
		System.out.println(ch + " = " + (byte)ch);
		}
	}

}
