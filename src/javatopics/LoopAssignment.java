package javatopics;

public class LoopAssignment {

	public static void main(String[] args) {
// WAP to print following output:-----5 times i am batman
		int i = 0;
		while (i <= 4) {
			System.out.println("I AM BATMAN");
			i++;
		}
		System.out.println("-------------------------------------------------------");
//WAP to print following output:-----5 times i am batman

		for (int j = 1; j <= 9; j++) {
			System.out.println("I AM BATMAN" + " " + j);
		}
		System.out.println("-------------------------------------------------------");
		//WAP to print following output:-----10 times i am batman
		int counter=1;
		while(true)
		{
			System.out.println("I AM BATMAN" + " = " + counter);
			counter++;
			if (counter == 10)
			{
				break;
			}
		}
		
		
		

		System.out.println("-------------------------------------------------------");
//WAP to print 10 to 1 using for, while and do-while loop
		for (int a = 10; a >= 0; a--) {
			System.out.println(a);
		}
		System.out.println("-----------");
		int b = 10;
		while (b >= 0) {
			System.out.println(b);
			b--;
		}
		System.out.println("-----------");
		int c = 10;
		do {
			System.out.println(c);
			c--;
		} while (c >= 0);

		System.out.println("-------------------------------------------------------");
//Write a program in Java to print "Hello World" ten times using while loop
		int d = 1;
		while (d <= 10) {
			System.out.println("Hello World");
			d++;
		}

		System.out.println("-------------------------------------------------------");
//Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		int e = 1;
		while (e <= 100) {
			if (e % 5 == 0)
				System.out.println(e);
			e++;
		}
		System.out.println("---------");
		for (int j = 1; j <= 100; j++) {
			if (j % 5 == 0)
				System.out.println(j);
		}
		System.out.println("==========");
		int k = 1;
		do {
			k++;
			if (k % 5 == 0) {
				System.out.println(k);
			}
		} while (k <= 100);
		System.out.println("---------------------------------------------------------------");
//Print all odd and even numbers between 1 to 100		

		int l = 1;
		do {
			if (l % 2 == 0) {
				System.out.println("Even Number" + " " + l);
			} else {
				System.out.println("Odd Number " + " " + l);
			}
			l++;
		} while (l <= 100);

		System.out.println("---------------------------------------------------------------");
// What will be the output of this program:====== Infinity Loop

//int i1 = 1;
//
//while(i1<=1){
//
//System.out.println("Hi Java");
//
//}		

		System.out.println("---------------------------------------------------------------");
//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + " = " + (byte) ch);
			ch++;
		}
		System.out.println("-----");
		char ch1 = 'A';
		while (ch1 <= 'Z') {
			System.out.println(ch1 + " = " + (byte) ch1);
			ch1++;
		}
		System.out.println("------");
		char ch2 = '0';
		while (ch2 <= '9') {
			System.out.println(ch2 + " = " + (byte) ch2);
			ch2++;
		}
		System.out.println("----------------------");
		for (char ch3 = 'a'; ch3 <= 'z'; ch3++) {
			System.out.println(ch3 + " = " + (byte) ch3);
		}
		System.out.println("------");
		for (char ch4 = 'A'; ch4 <= 'Z'; ch4++) {
			System.out.println(ch4 + " = " + (byte) ch4);
		}
		System.out.println("-------");
		for (char ch5 = '0'; ch5 <= '9'; ch5++) {
			System.out.println(ch5 + " = " + ch5);
		}

		System.out.println("---------------------------------------------------------------");
//Print the following series: --- 1.0 2.0 3.0  ...... 10.0 
		for (float f = 1.0f; f <= 10.0; f++) {
			System.out.println(f);
		}
		System.out.println("----");
//0 9 18 27 36 …99
		for (int n = 0; n <= 100; n++) {
			if (n % 9 == 0) {
				System.out.println("MUlTIPLE of NINE" + " = " + n);
			}
		}
		System.out.println("---------------------------------------------------------------");
//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		for (int N = 1; N <= 10; N++) {
			if (N % 7 == 0) {
				System.out.println("Bye,See You Tomorrow");
				break;
			} else {
				System.out.println(N);
			}

		}
		System.out.println("---------------------------------------------------------------");
//Print vowels (aeiou) and consonant using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		for (char a1 = 'a'; a1 <= 'z'; a1++) {
			if (a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u') {
				System.out.println("vowel" + " " + a1);
			} else {
				System.out.println("consonant" + " " + a1);
			}
		}
		System.out.println("---------------------------------------------------------------");
//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.		
		for (char b1 = 'a'; b1 <= 'z'; b1++) {
			if (b1 == 'a' || b1 == 'e' || b1 == 'i' || b1 == 'o' || b1 == 'u') {
				System.out.println(b1 + " " + "is a vowel");
			}
		}
		System.out.println("---------");
		char c1 = 'a';
		while (c1 <= 'z') {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				System.out.println(c1 + " " + "is a vowel");
			}
			c1++;
		}

	}

}
