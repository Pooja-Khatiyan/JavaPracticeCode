package javatopics;

public class IncrementDecrementPractice {

	public static void main(String[] args) {
		int a = 11;
		a = a++ + ++a;// repLacing a's value
		System.out.println(a);// 24

		int b = 11, c = 22, d;
		d = b + c + b++ + c++ + ++b + ++c;
		System.out.println("the value of b: " + b);// 13
		System.out.println("the value of c: " + c);// 23
		System.out.println("the value of d: " + d);// 103

		int e = 0;
		int f = e++ - --e + ++e - e--;
		System.out.println("the value of f: " + f);// 0
		System.out.println("the value of e: " + e);// 0

		int g = 19, h = 29, i = 0, j;
		j = g-- - h-- - i--;
		System.out.println("the value of g: " + g);// 18
		System.out.println("the value of h: " + h);// 28
		System.out.println("the value of i: " + i);// -1
		System.out.println("the value of j: " + j);// -10

		// int k=2;
		// int l= --(k++);----- directly should be applied on variable
		// int l= --k++;------- even at same time we can't increase or decrease the
		// value of a variable.

		int k = 0, l = 0, m;
		m = --k * --l * l-- * k--;
		System.out.println("the value of k: " + k);// -2
		System.out.println("the value of l: " + l);// -2
		System.out.println("the value of m: " + m);// 1

		byte n = 1;
		int o = n++ + ++n * --n - n--;
		System.out.println("the value of n: " + n);
		System.out.println("the value of o: " + o);

		short ch = 'A';
		System.out.println("the value of ch: " + ch++);// 65
		System.out.println("the value of ch: " + ch);// 66
		System.out.println("the value of ch: " + (char) ch);// B

		char ch1 = 'A';
		System.out.println("the value of ch1: " + ch1++);// A
		System.out.println("the value of ch1: " + ch1);// B

		short ch2 = 'A';
		System.out.println("the value of ch: " + ++ch2);// 66
		System.out.println("the value of ch: " + ch2);// 66
		System.out.println("the value of ch: " + (char) ch2);// B

		char ch3 = 'A';
		System.out.println("the value of ch1: " + ++ch3);// B
		System.out.println("the value of ch1: " + ch3);// B
		System.out.println("the value of ch1: " + (int) ch3);// 66

		double d1 = 1.5, D1 = 2.5, d2;
		d2 = d1++ + ++D1;
		System.out.println("the value of d1: " + d1);// 2.5
		System.out.println("the value of D1: " + D1);// 3.5
		System.out.println("the value od d2: " + d2);// 5.0

		double d11 = 1.5, D11 = 2.5, d21;
		d21 = ++d11 + ++D11;
		System.out.println("the value of d11: " + d11);// 2.5
		System.out.println("the value of D11: " + D11);// 3.5
		System.out.println("the value od d21: " + d21);// 6.0

	}

}
