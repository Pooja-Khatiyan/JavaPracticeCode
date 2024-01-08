package methodassignment;

public class FactorialSeries {
	public int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
		FactorialSeries obj = new FactorialSeries();
		int factorial = obj.factorial(5);
		System.out.println(factorial);

	}

}
