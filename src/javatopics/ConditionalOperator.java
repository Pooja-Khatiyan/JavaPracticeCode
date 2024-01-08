package javatopics;

public class ConditionalOperator {

	public static void main(String[] args) {

		int a = 10;
		if (a == 10)// representing true
		{
			System.out.println("hello");
		}

		else {
			System.out.println("bye");
		}

		if (a == 20)// representing false
		{
			System.out.println("hello");
		}

		else {
			System.out.println("bye");
		}
		int X = 100;
		int Y = 200;
		if (X == Y) {
			System.out.println("vihan");
		}

		else {
			System.out.println("mommy");
		}

		if (X != Y) {
			System.out.println("vihan");

		}

		else {
			System.out.println("mommy");
		}

		if (true)// directly/ explicitly defined the value
		{
			System.out.println("helloselenium");
		} else {
			System.out.println("byeselenium");// DEAD CODE
		}
		if (false) {
			System.out.println("helloselenium");// DEAD CODE
		} else {
			System.out.println("byeselenium");

		}
		// ----------------------------------------------------------------//

		boolean flag = false; // value is assign to variable
		if (flag) {
			System.out.println("helloworld");
		} else {
			System.out.println("byeworld");

		}
		int X1 = 200;
		int Y1 = 300;

		if (X1 > Y1) {
			System.out.println("X1 i sgreater than Y1");
		} else {
			System.out.println("Y1 i sgreater than X1");
		}

		if (X1 <= Y1) {
			System.out.println("X1 i sgreater than Y1");
		} else {
			System.out.println("Y1 i sgreater than X1");
		}

		int x = 100, y = 500, z = 200;
		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}

		int A = 100, B = 200, C = 300, D = 500;

		if (A > B && A > C && A > D) {
			System.out.println("A is greater");
		} else if (B > C && B > D) {
			System.out.println("B is greater");
		} else if (C > D) {
			System.out.println("C is greater");
		} else {
			System.out.println("D is greater");
		}

	}
}
