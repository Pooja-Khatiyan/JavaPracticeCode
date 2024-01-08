package javatopics;

public class WhileLoopConcept {

	public static void main(String[] args) {

//	infinity while loop 
//		byte i =1;
//		while (i<=10)
//		{
//			System.out.println(i);
//		}

// printing 1-10

		byte a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;// we can also use ++a or a=a+1
		}

		System.out.println("--------------------------------------------------------");
//wap for odd numbers
		byte b = 1;
		while (b <= 10) {
			System.out.println(b);
			b = (byte) (b + 2);
		}

		System.out.println("-----------------------------------------------------------");
//wap for even numbers		
		byte c = 2;
		while (c <= 10) {
			System.out.println(c);
			c = (byte) (c + 2);
		}

		System.out.println("----------------------------------------------------------");
//printing only 2
		byte d = 2;
		while (d <= 10) {
			System.out.println(d);
			d = (byte) (d + 2);
			break;
		}

		System.out.println("----------------------------------------------------------");
//wap for 1-100
		int e = 1;
		while (e <= 100) {
			System.out.println(e);
			e++;
		}

		System.out.println("----------------------------------------------------------");
//wap for 100-1
		int f = 100;
		while (f >= 1) {
			System.out.println(f);
			f--;
		}

		System.out.println("----------------------------------------------------------");
//wap for 1-9		
		int g = 1;
		while (g < 10) {
			System.out.println(g);
			g++;
		}
		System.out.println("----------------------------------------------------------");
//wap ---write Hi after multiple of 5
		int h = 1;
		while (h <= 50) {
			System.out.println(h);

			if (h % 5 == 0) {
				System.out.println("HI");
			}
			h++;
		}

		System.out.println("----------------------------------------------------------");
//wap-- write HI before multiple of 5	
		int i = 1;
		while (i <= 50) {
			System.out.println(i);
			i++;
			if (i % 5 == 0) {
				System.out.println("HI");
			}

		}

		System.out.println("----------------------------------------------------------");
//wap-- write HI on the place of multiple of 5	

		int j = 1;
		while (j <= 50) {
			if (j % 5 == 0) {
				System.out.println("HI");
				// break; ----print 1234HI
			} else {
				System.out.println(j);
				// break;----- print 1 only
			}
			j++;
		}
		System.out.println("----------------------------------------------------------");
//infinity loop
//int z=1;
//while (z<=50)
//{
//	System.out.println(z);
//	
//	if (z%5==0)
//	{
//		System.out.println("HI");
//		z++;
//	}	
//
//}

		System.out.println("----------------------------------------------------------");
//wap ---write Hi after multiple of 5
		int l = 1;
		while (l <= 50) {
			System.out.println(l);

			if (l % 5 == 0) {
				System.out.println("HI");// 12345HI
				break;
			}
			l++;

		}

		System.out.println("------------------------------");
//wap for ASCII TABLE a-z

		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + " = " + (byte) ch);
			ch++;

		}

		System.out.println("---------------------------------");

		char ch1 = 'A';
		while (ch1 <= 'Z') {
			System.out.println(ch1 + " = " + (byte) ch1);
			ch1++;

		}

		System.out.println("---------------------------------");
//ascii code
		char ch2 = 'Z';
		while (ch2 >= 'A') {
			System.out.println(ch2 + " = " + (byte) ch2);
			ch2--;

		}
		System.out.println("---------------------------------");
//ascii code
		char ch3 = 'z';
		while (ch3 >= 'a') {
			System.out.println(ch3 + " = " + (byte) ch3);
			ch3--;

		}

		System.out.println("---------------------------------");
//ascii code for no. 0-9 
		char number = '0';
		while (number <= '9') {
			System.out.println(number + " = " + (byte) number);
			number++;

		}

		System.out.println("---------------------------------");
//ascii code for no. 0-9,reverse order
		char number1 = '9';
		while (number1 >= '0') {
			System.out.println(number1 + " = " + (byte) number1);
			number1--;
		}
		System.out.println("----------------------------------------------------------------");

		int A = 1;
		while (A <= 50) {
			if (A % 2 == 0) {
				System.out.println("Even Number" + " " + A);
			} else {
				System.out.println("Odd Number " + " " + A);
			}
			A++;
		}
		System.out.println("----------------------------------------------------------------");
//infinity loop
//while(true)
//{
//	System.out.println("WELCOME TO HOTEL TAJ");
//}

		System.out.println("----------------------------------------------------------------");
//dead code
//while(false)
//{
//System.out.println("dead code");	
//}
		System.out.println("----------------------------------------------------------------");
		boolean flag = false;
		while (flag) {
			System.out.println("WELCOME TO HOTEL TAJ");
		}

		System.out.println("----------------------------------------------------------------");
		int counter = 0;
		while (true) {
			System.out.println("hello world");
			counter++;
			if (counter == 10) {
				break;
			}
		}

	}

}
