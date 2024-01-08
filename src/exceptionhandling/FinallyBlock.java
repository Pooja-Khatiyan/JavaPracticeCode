package exceptionhandling;

public class FinallyBlock {
//we should follow the sequence try -catch - finally or try-finally or try -catch 
// we can't write finally alone.
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		try {
			int j= 9/3 ;//exception is not coming it does not go inside catch block directly jump to finally after try
			//int i = 9 / 0;
			System.out.println("Hello");//never be executed
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
		} finally {//no matter is there exception or not it compulsory go inside finally block
			System.out.println("FINALLY BLOCK");
		}
	}

}
