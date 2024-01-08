package javatopics;

public class StringConcatenation {

	public static void main(String[] args) {
		String A = "hello";
		String B = "world";
		int C = 100;
		int D = 200;
		float E = 12.22f;
		float F = 22.44f;
		char G = 'a';
		char g = 'b';
		char H = 'A';
		char I = '!';
		System.out.println(A);
		System.out.println(B);
		System.out.println(A + " " + B);
		System.out.println(A + C + B + D + F);// hello100world20022.44
		System.out.println(C + D + E + A + F + B);// 312.22hello22.44world
		System.out.println("the value of C " + C);
		System.out.println("the value of A: " + A);
		System.out.println("happy beginning: " + A + " " + B);
		System.out.println("the total sum : " + (C + D));
		System.out.println(G);
		System.out.println((int) G);
		System.out.println(G + H);// 97+65
		System.out.println((int) I);
		System.out.println((int) '@');
		System.out.println((int) '/');
		System.out.println(G - 1);
		System.out.println(G + "1");
		System.out.println(H + G + A + B);// 162 helloworld
		System.out.println(G + " " + g);
		// System.out.println("G"+"g");

	}

}
