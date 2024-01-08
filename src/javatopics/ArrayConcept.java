package javatopics;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
//i value is replace to 30
		int i = 10;
		i = 20;
		i = 30;
		System.out.println(i);
//array is a collection of similar type of data
//declaring an array using new keyword
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
//a[4]=50; AIOBE--size of array is fixed-- this is run time exception--in JAVA there is no concept of negative index
//two ways to fetch array
		System.out.println(Arrays.toString(a));
		System.out.println("-----------------------------------------------------");
		for (int k = 0; k < a.length; k++) {
			System.out.println("the value at index k : " + " = "+ a[k]);
		}
		System.out.println("-----------------------------------------------------");
		for (int e : a) {
			System.out.println(e);
		}
		System.out.println("-----------------------------------------------------");
		// reverse order with for each loop
		int timer = a.length - 1;
		for (int e : a) {
			e = timer;
			System.out.println(a[e]);
			timer--;
		}

		System.out.println("=======================================================");
//another way of writing loop ---only---if we have knowledge of length of an array
		for (int k = 0; k < 4; k++) {
			System.out.println(a[k]);
		}
		System.out.println(a[0] + a[1]);// arithmetic operation can also be performed on index
		System.out.println(a[2] + a[3]);
		System.out.println(a);// it is an memory address of an array

		System.out.println("----------------------------------------------------------------");
		for (int k = 0; k < a.length; k++) {
//System.out.println(a[k]);
			if (a[k] == 20) {
				System.out.println("hi");
			} else {
				System.out.println("bye");
			}
		}

		System.out.println("----------------------------------------------------------------");
//array with break
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
			if (a[k] == 20) {
				System.out.println("bye");
				break;
			}
		}
		System.out.println("----------------------------------------------------------------");
		byte pop[] = new byte[5];
		pop[0] = 100;
		pop[4] = 75;
		pop[1] = 25;
		System.out.println(Arrays.toString(pop));
		System.out.println(pop.length);
		System.out.println("***********************************************");
		byte b = 0;
		for (byte e : pop) {
			System.out.println(b + " = " + e);
			b++;
		}
		System.out.println("-----");
		// reverse loop with for each
		byte c = (byte) ((pop.length) - 1);
		for (byte e : pop) {
			e = c;
			System.out.println(c + " = " + pop[e]);
			c--;
		}

		System.out.println("----------------------------------------------------------------");
		short sh[] = new short[6];
		sh[0] = 11;
		sh[4] = 75;
		sh[1] = 25;
		System.out.println(Arrays.toString(sh));
		System.out.println(sh.length);
		for (short e : sh) {
			System.out.println(e);
		}
		int count5 = 0;
		for (short e : sh) {
			System.out.println(count5 + " = " + e);
			count5++;
		}
		System.out.println("&&&&&&&&&&&&");
		// reverse loop with for each
		short c1 = (short) ((sh.length) - 1);
		for (short e : sh) {
			e = c1;
			System.out.println(c1 + " = " + sh[e]);
			c1--;
		}

		System.out.println("----------------------------------------------------------------");
		long log[] = new long[5];
		log[0] = 450;
		log[4] = 750;
		log[1] = 251;
		System.out.println(Arrays.toString(log));
		int count4 = 0;
		for (long e : log) {
			System.out.println(count4 + " = " + e);
			count4++;
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//reverse loop with for each
		for (int l = log.length - 1; l >= 0; l--) {
			System.out.println(log[l]);
		}
//Don't do type casting in such cases like long to int and float to int.Always use index based loop to reverse it.

//			long timers = (long ) ((log.length)-1);
//			for(long e : log)
//			{
//				e=timers;
//				System.out.println(log[(int)e]);
//				timers--;
//			}		
//			
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		System.out.println("----------------------------------------------------------------");
		float f[] = new float[5];
		f[0] = 100f;
		f[4] = 75f;
		f[1] = 25f;
		System.out.println(Arrays.toString(f));
		int count3 = 0;
		for (float e : f) {
			System.out.println(count3 + " = " + e);
			count3++;
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//reverse loop with for each
		for (int f1 = f.length - 1; f1 >= 0; f1--) {
			System.out.println(f[f1]);
		}
//Don't do type casting in such cases like long to int and float to int.Always use index based loop to reverse it.

//		float f1 = (float ) ((f.length)-1);
//		for(float e : f)
//		{
//			f1=e;
//			System.out.println(f1 + " = " + f[(int)e]);
//			f1--;
//		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		double d[] = new double[5];
		d[0] = 1093;
		d[4] = 7532;
		d[1] = 2125;
		System.out.println(Arrays.toString(d));
		System.out.println("===================================================================");
		int count2 = 0;
		for (double e : d) {
			System.out.println(count2 + " = " + e);
			count2++;
		}
		System.out.println("-----");
		for (int c11 = d.length - 1; c11 >= 0; c11--) {
			System.out.println(d[c11]);
		}

		System.out.println("----------------------------------------------------------------");
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[4] = 'b';
		ch[1] = 'c';
		System.out.println(Arrays.toString(ch));
		System.out.println(ch);// for char it is not giving any garbage value or memory address
		System.out.println(ch.length);
		System.out.println("-------");
		int count1 = 0;
		for (char e : ch) {
			System.out.println(count1 + " = " + e);
			count1++;
		}
		System.out.println("-----");
		for (int a1 = ch.length - 1; a1 >= 0; a1--) {
			System.out.println(ch[a1]);
		}

		System.out.println("----------------------------------------------------------------");
		String testing[] = new String[5];
		testing[0] = "mobile";
		testing[4] = "web page";
		testing[1] = "chrome";
		System.out.println(Arrays.toString(testing));
		System.out.println("----------------------------------------------------------------");
		for (int b1 = testing.length - 1; b1 >= 0; b1--) {
			System.out.println(testing[b1]);
		}

//float f []= new int [5];//syntax error--type mismatch --- can't hold different data type 
//Dont do type casting in such cases like long to int and float to int.Always use index based loop to reverse it.

//String Array==========================================================	
		String empNames[] = new String[6];
		empNames[0] = "Pooja";
		empNames[1] = "Neha";
		empNames[2] = "Shetal";
		empNames[3] = "Kiran";
		empNames[4] = "Chitra";
		// empNames[5]="Richa"; // if any value is null in that case loop through run
		// time exception
		System.out.println(empNames.length);
		System.out.println(Arrays.toString(empNames));
		for (int i1 = 0; i1 < empNames.length; i1++) {
			System.out.println(empNames[i1]);
			if (empNames[i1].equals("Shetal")) {
				System.out.println("promoted to sdet2");
				break;
			}
		}
		System.out.println("------------------------------------------------------------------------");
		int count = 0;
		for (String e : empNames) {
			System.out.println(count + " = " + e);
			count++;
		}
		System.out.println(Arrays.toString(empNames));
//Reverse Loop
		for (int i11 = empNames.length - 1; i11 >= 0; i11--) {
			System.out.println(empNames[i11]);
		}

//c3 is integer and e is String.So dont use for each loop here. Use index based loop to reverse it.
//Dont do type casting in such cases like long to int and float to int.Always use index based loop to reverse it.

//		int c3 =empNames.length - 1;
//		for (String e : empNames) {
//			e = c3;
//			System.out.println(c3 + " = " + empNames[e]);
//			c3--;
//		}

	}

}
