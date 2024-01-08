package methodassignment;

public class BasicCalculator {

	public int addition(int a, int b) {
		int sum = a + b;
		System.out.println("Addition Method...");
		return sum;
	}

	public int subtraction(int a, int b) {
		int diff = a - b;
		System.out.println("Subtraction Method...");
		return diff;
	}

	public int multiplication(int a, int b) {
		int multiple = a * b;
		System.out.println("Multiplication Method...");
		return multiple;
	}

	public int division(int a, int b) {
		int divide = a / b;
		System.out.println("Division Method...");
		return divide;
	}

	public static void main(String[] args) {
//Write a program to print the addition/subtraction/division/multiplication of two numbers entered by 
		// user by defining your own method
		BasicCalculator obj = new BasicCalculator();
		int sum = obj.addition(10, 20);
		System.out.println(sum);
		int diff = obj.subtraction(50, 0);
		System.out.println(diff);
		int multiple = obj.multiplication(12, 5);
		System.out.println(multiple);
		int division = obj.division(50, 2);
		System.out.println(division);

	}

}
