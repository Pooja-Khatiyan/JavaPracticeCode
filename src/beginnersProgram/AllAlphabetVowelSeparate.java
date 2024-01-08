package beginnersProgram;

public class AllAlphabetVowelSeparate {

	public static void main(String[] args) {
		String Alphabets = "";
		String Vowels = "";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			Alphabets =(Alphabets +ch +",");
			//System.out.println("these are the Alphabets: " + Alphabets);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				Vowels =(Vowels +ch +",");
			}
		}
		System.out.println("these are the Alphabets: " + Alphabets);
		System.out.println("these are the Vowels: " + Vowels);
		
		System.out.println("-----------------");
		String evenlist = "" ;
		String oddlist= "";
		String numlist = "";
		for (int n = 1; n <= 100; n++) {
			numlist = (numlist +n +",");
			if (n % 2 == 0) {
				evenlist =(evenlist +n +",");
			}
			if (n % 2 != 0) {
				oddlist =(oddlist +n +",");
			}
		}
	    System.out.println("Original Array is these : " + numlist);
		System.out.println("these are even numbers: " + evenlist);
		System.out.println("these are odd numbers: " + oddlist);
// try with int data type instead of String as in example we are using numbers		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
