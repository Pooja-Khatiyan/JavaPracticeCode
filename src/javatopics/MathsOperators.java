package javatopics;

public class MathsOperators {

	public static void main(String[] args) {
		System.out.println(10 / 2);
		System.out.println(9 / 2);
		System.out.println((float) 10 / 3);
		System.out.println((double) 10 / 3);
		System.out.println(9.0 / 2);
		System.out.println(9 / 2.0);// Infinity
		System.out.println(9.0 / 2.0); // Infinity
		// System.out.println(10/0);//arithmeticexception / by zero
		System.out.println(10.0 / 0);// Infinity
		// System.out.println(0/0);// Arithmeticexception/ by zero
		System.out.println(0 / 0.0);// NaN
		System.out.println(0 / 10);// 0
		System.out.println(0 / 10.0);// 0.0
		System.out.println(0.0 / 10.5);
		System.out.println('a' / 2);// 48
		System.out.println('a' / 2.0);// 48.5
		// System.out.println('a'/0 );
		System.out.println('a' / 0.0);
		System.out.println('a' / 2 + 100);// 148
		System.out.println('a' / 2.0 + 100);// 148.5
		System.out.println('a' % 2);// 1
		System.out.println(10.0 / 3);// 3.333333333333335 ------> some double value
		System.out.println(10.0f / 3);// 3.3333333 -----> now it will give result in floating
		System.out.println(10.0 % 3);// -----------1.0--------important

	}

}
