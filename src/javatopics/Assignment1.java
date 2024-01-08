package javatopics;

public class Assignment1 {

	public static void main(String[] args) {
		String A = "Pooja", B = "Khatiyan";
		System.out.println(A + " " + B);

		System.out.println("-------------------------------------------");

		int a = 74, b = 36;
		int c = a + b;
		System.out.println(c);

		System.out.println("---------------------------------------------");

		int d = 50, e = 3;
		System.out.println(d / e);

		System.out.println("-----------------------------------------------");

		double f = 25.5f, g = 3.5f, h = 40.5f, i = 4.5f;
		double G = (f * g - g * g) / (h - i);
		System.out.println(G);

		System.out.println("-----------------------------------------------");

		String j = "Hello Selenium";
		char k = 't';
		System.out.println(j + " " + k);

		System.out.println("-----------------------------------------------");

		int l = 100, m = 200, n = 3400;
		int o = l + m + n;
		System.out.println("Your Total amount is: " + o);

		System.out.println("-----------------------------------------------------");

		char p = 'h';
		System.out.println((byte) p);

		System.out.println("--------------------------------------------------");

		char q = 'd';
		int r = q + 3;
		System.out.println((char) r);

		System.out.println("--------------------------------------------------");

		float s = 3.9f;
		float t = s * s;
		System.out.println(t);

		System.out.println("------------------------------------------------------");

		int I = 11, J = 22, K;
		K = I + J + I++ + J++ + ++I + ++J;
		System.out.println(K);

		System.out.println("------------------------------------------------------");

		int i1 = 0;
		i1 = i1++ - --i1 + ++i1 - i1--;
		System.out.println(i);

		System.out.println("------------------------------------------------------");

		int i2 = 1, j2 = 2, k2 = 3;
		int m2 = i2-- - j2-- - k2--;
		System.out.println("i2=" + i2);
		System.out.println("j2=" + j2);
		System.out.println("k2=" + k2);
		System.out.println("m2=" + m2);

		System.out.println("------------------------------------------------------");

		int a11 = 1, b11 = 2;
		System.out.println(--b11 - ++a11 + ++b11 - --a11);

		System.out.println("------------------------------------------------------");

		int i11 = 19, j11 = 29, k11 = 0;
		int m11 = i11-- - j11-- - k11--;
		System.out.println("i11=" + i11);
		System.out.println("j11=" + j11);
		System.out.println("k11=" + k11);
		System.out.println("m11=" + m11);

		System.out.println("------------------------------------------------------");

		int m22 = 0, n22 = 0;
		int p22 = --m22 * --n22 * n22-- * m22--;
		System.out.println("m22=" + m22);
		System.out.println("n22=" + n22);
		System.out.println("p22=" + p22);

		System.out.println("------------------------------------------------------");

		int a21 = 1;
		int b21 = a21++ + ++a21 * --a21 - a21--;
		System.out.println(a21);
		System.out.println(b21);

		System.out.println("--------------------------------------------");
		int ch = 'A';
		System.out.println(ch++);
		System.out.println(ch);

		char ch1 = 'A';
		System.out.println(ch1++);
		System.out.println(ch1);

		System.out.println("-----------------------------------------");
//session ----6 discussion...
		byte i33 = 127;
		byte j33 = 125;
		// byte k33 = (byte) (i33 + j33);//127+125 =252
		System.out.println((int) (i33 + j33));// 252, now it will give right output
//it doesn't fit in byte it overflow as byte can store upto 127
//we can store no. in byte from -128 to 127(range---sum of it----256 including 0)
//internally it calculated like 252(total sum of above no.) - 256(total no that will be store inside byte) = -4
		// System.out.println("value of k33:" + k33);//-4

		int I1 = -2147483648;
		int J1 = -2147483648;
		long K1 = (long) (I1 + J1);// if we deliberately place I1 + J1 in bracket ,in this case first it perform
									// calculation
//on I1+J1----overflow ---- get 0 output ---- just like as in above case we get -4 ---- then we are trying to convert 0
// inside the long i.e we are getting 0 as output.if we remove bracket of I1 +J1 we will get right output.
		System.out.println(K1);

		System.out.println("---------------------------------------------");

		int A1 = 200;
		byte B2 = (byte) 128;
		int C3 = A1 + B2;
		System.out.println(C3);// 72
//max values for byte 256----200+128:328-256-----72		
//addition result should always be store in int		

	}
}
