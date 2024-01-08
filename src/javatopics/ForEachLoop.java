package javatopics;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
//Enhanced for  loop /Advance for loop
		String empnames[] = new String[5];
		empnames[0] = "Priya";
		empnames[1] = "Riya";
		empnames[2] = "Siya";
		empnames[3] = "Diya";
		// empnames[4]="Taniya";
		System.out.println(empnames.length);
		System.out.println(Arrays.toString(empnames));
		for (String e : empnames) {
			System.out.println(e);
			if (e.equals("Siya")) {
				System.out.println("promoted to SDET 2");
				break;// if condition is satisfied it will come out of loop---it will start giving
						// exception as last index value is null
			}
			// break;//print only one index value and break entire loop
		}

		System.out.println("---------------------------------------------------------------");
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i);// memory add of the array
		System.out.println(Arrays.toString(i));
		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("---------------------------------------------------------------");
		float f[] = new float[4];
		f[0] = 12.98f;
		f[1] = 34.88f;
		f[2] = 65.90f;
		f[3] = 44.89f;
		for (float e : f) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(f));

		System.out.println("---------------------------------------------------------------");
		char ch[] = new char[4];
		ch[0] = 'A';
		ch[1] = 'b';
		ch[2] = '&';
		ch[3] = '4';
		System.out.println(ch);// not giving any garbage value or memory address
		System.out.println(Arrays.toString(ch));
		System.out.println("=========================================================================");
		char ch1[] = new char[3];
		System.out.println(ch1);
		for (long e : ch) {
			System.out.println(e);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		for (char e : ch) {
			System.out.println(e);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (int e1 : ch)// byte & short are not allowed here----char comes from int family below data
							// type are not allowed higher are allowed
		{
			System.out.println(e1);
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		byte n[] = new byte[4];
		n[0] = 10;
		n[1] = 20;
		n[2] = 30;
		n[3] = 40;

		for (byte e3 : n) {
			System.out.println(e3);
		}
		System.out.println("--------------------------------------------------------");

		
	}

}
