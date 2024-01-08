package javatopics;

public class IncrementDecrementlOperators {

	public static void main(String[] args) {
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		int c = 10;
		int d = c++;
		System.out.println(c);// 11
		System.out.println(d);// 10
		int e = 20;
		int f = ++e;
		System.out.println(e);// 21
		System.out.println(f);// 21
		int g = 30;
		int h = g--;
		System.out.println(g);// 29
		System.out.println(h);// 30
		int i = 40;
		int j = --i;
		System.out.println(i);// 39
		System.out.println(j);// 39
		int k = 40;// basic maths different from increment operator
		int l = k + 1;
		System.out.println(l);// 41
		System.out.println(k);// 40
		int m = -99;
		int n = m++;
		System.out.println(m);// -98
		System.out.println(n);// -99
		int pop = 34;
		System.out.println(pop++);// 34
		System.out.println(pop);// 35
		int top = 39;
		System.out.println(++top);// 40
		System.out.println(top);// 40

		byte P = 1;
		byte K = (byte) (P + 1);// important syntax
		System.out.println(K);

		byte P1 = 1;
		byte P2 = 2;
		byte K2 = (byte) (P1 + P2);
		System.out.println(K2);

		int I = -2147483648;
		int J = -2147483648;
		long K1 = (long) I + J;// important syntax
		System.out.println(K1);

		short p10 = 1;
		short k10 = (short) (p10 + 2);
		System.out.println(k10);

	}

}
