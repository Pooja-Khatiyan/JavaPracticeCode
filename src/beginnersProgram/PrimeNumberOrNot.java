package beginnersProgram;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int n = 99;
		int count = 0;
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}
		if (count > 0) {
			System.out.println("NOT A PRIME NUMBER: " + " " + n);
		} else {
			System.out.println("IS A PRIME NUMBER: " + " " + n);
		}
		System.out.println("-------------------------------------");
//print prime no between 0 to 100

		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 0) {
				System.out.println("IS A PRIME NUMBER: " + " " + i);
			} else {
				System.out.println("NOT A PRIME NUMBER: " + " " + i);
				count = 0;
			}

		}
		System.out.println("-----------------------------------------");
// to find the factorial of a given number
		int num = 4;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Value Of Factorial: " + num + " = " + fact);

		System.out.println("-----------------------------------------");
//print the Fibonacci series
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
