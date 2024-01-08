package javatopics;

public class ForLoopConcept {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------------");
		// odd number
		int a = 1;
		for (; a <= 20;) {
			System.out.println(a);
			a = a + 2;
		}
		System.out.println("-------------------------------------------------");
//even number
		int b = 2;
		for (; b <= 50;) {
			System.out.println(b);
			b = b + 2;
		}

		System.out.println("-------------------------------------------------");
//infinity loop on the gate of taj hotel 24*7
//for(;;)
//{
//System.out.println("WELCOME TO HOTEL TAJ");	
//
//}
		System.out.println("-------------------------------------------------");

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}
		System.out.println("-------------------------------------------------");
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			System.out.println(ch1 + " = " + (byte) ch1);
		}

		System.out.println("-------------------------------------------------");
		for (char ch2 = 'z'; ch2 >= 'a'; ch2--) {
			System.out.println(ch2 + " = " + (byte) ch2);
		}
		System.out.println("-------------------------------------------------");
		for (char ch3 = 'Z'; ch3 <= 'A'; ch3--) {
			System.out.println(ch3 + " = " + (byte) ch3);
		}
		System.out.println("-------------------------------------------------");
		for (char ch4 = '0'; ch4 <= '9'; ch4++) {
			System.out.println(ch4 + " = " + (byte) ch4);
		}

		System.out.println("-------------------------------------------------");
		for (char ch5 = '9'; ch5 >= '0'; ch5--) {
			System.out.println(ch5 + " = " + (byte) ch5);
		}
		System.out.println("-------------------------------------------------");
		for (float f = 1.1f; f <= 5.5; f++) {
			System.out.println(f);
		}

		System.out.println("-------------------------------------------------");
		for (int j = 1; j <= 50; j++) {
			System.out.println(j);

			if (j % 5 == 0) {

				System.out.println("hello world");
			}
		}
		System.out.println("-------------------------------------------------------------");
//break

		for (int k = 1; k <= 40; k++) {
			System.out.println(k);

			if (k % 5 == 0) {

				System.out.println("hello world");
				break;
			}
		}
		System.out.println("-------------------------------------------------------------");
//break--- difference between use of break

		for (int k1 = 1; k1 <= 30; k1++) {
			System.out.println(k1);

			if (k1 % 5 == 0) {

				System.out.println("hello world");
				break;
			}
			//break;
		}
		System.out.println("-------------------------------------------------------------");
//wap for even odd
		for (int n = 1; n <= 50; n++) {
			if (n % 2 == 0) {
				System.out.println("Even Number" + " = " + n);
			} else {
				System.out.println("Odd Number " + " =  " + n);
			}
		}
		System.out.println("-------------------------------------------------------------");
//descending from 10 to 0
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------------------------");
		// print once then break the loop
for ( ; ; ) {
	System.out.println("HELLO");
	break;
}

for (int i0=10 ; i0 >1 ; i0++)
{
System.out.println(i0);	
break;
}
	
	
	
	
	
	
	}
	
}
