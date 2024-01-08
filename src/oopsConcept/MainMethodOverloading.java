package oopsConcept;

//public-becz it might happened jvm is install in different drive [c,d,e whatever]-jvm get easy access without restriction
//void becz it doesn't return anything
//String []--command line argument.
//static becz to avoid object creation --agar non static hota jvm ko access karne ke liye object create karna padta
//main becz in jvm it's name is defined as main if we want to change it--we have to change it in jvm file also(check)
public class MainMethodOverloading {

//	public static void main(String[] args) {
//		System.out.println("default main method");
//		}
	public static void main(String[] pooja) {
		System.out.println("main method 2");
//to call main method 2 or any
		MainMethodOverloading.main(28);
		MainMethodOverloading.main("pooja", 34);

	}

	public static void main(int a) {
		System.out.println("main method 3 " + " " + a);
	}

	public static void main(String a, int b) {
		System.out.println("main method 4 " + " " + a + " " + b);
	}

	public static void main(int[] a) {
		System.out.println("main method 5 " + " " + a);
	}
}
