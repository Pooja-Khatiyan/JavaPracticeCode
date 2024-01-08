package javatopics;

public class DoWhileLoop {

	public static void main(String[] args) {
// infinity loop
//	int i =1;
//	do {
//	System.out.println(i);	
//	}
//	while(i<=10);	
//		
		System.out.println("----------------------------------------------------------------");
//still infinity loop it doesn't reach to j++, wrong place to write increment operator should write inside the loop
//at line no. 20 condition satisfied so it doesn't reach to line no. 21
//	int j =1;
//	do {
//		System.out.println(j);
//	}
//	while(j<=10);
//	j++;	
		System.out.println("----------------------------------------------------------------");

//to resolve above issue we should place increment operator inside the loop		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		System.out.println("----------------------------------------------------------------");
//reverse counting
		int j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j >= 0);
		System.out.println("----------------------------------------------------------------");
//even if condition is not satisfied statement get one chance to be executed
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k >= 10);
		System.out.println("----------------------------------------------------------------");
		int l = 1;
		do {
			l++;
			System.out.println(l);// 234567891011 after 11 it terminate the loop
		} while (l <= 10);
		System.out.println("----------------------------------------------------------------");
//dowhile loop with break
		int m = 1;
		do {
			m++;
			System.out.println(m);
			break;
		} while (m <= 10);
		System.out.println("----------------------------------------------------------------");
//we can't write break after while as it is statement in this case it doesn't have any body--syntax error
		int n = 1;
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
//break;
		System.out.println("----------------------------------------------------------------");
//example of dead code or unreachable code
		int p = 0;
		do {
//	break;
			p++;
			System.out.println(p);
		} while (p <= 10);
		System.out.println("----------------------------------------------------------------");
//reverse counting
		int r = 10;
		do {
			System.out.println(r);
			r--;
		} while (r >= 0);
		System.out.println("----------------------------------------------------------------");
//statement get atleast one chance to be executed
		boolean flag = false;
		do {
			System.out.println("WELCOME TO HOTEL TAJ");
		} while (flag);
		System.out.println("----------------------------------------------------------------");
//infinity loop 
//good example to differentiate between while an ddo while loop
		do {
			System.out.println("HELLO MOTO");
		} while (false);
		System.out.println("----------------------------------------------------------------");

}

}
