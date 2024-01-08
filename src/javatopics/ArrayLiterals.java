package javatopics;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
//array literal is another way to write the array --> if we having values already in advance ---> we can use array literal
//difference between array literals without new keyword
		int num[] = { 10, 20, 30, 40, 50, 60 };
//we are sure how many values we have to store,here is no concept of default value as we already know how many segment
//and value we want to insert.

//Array with new keyword
		int p[] = new int[4];
		// we use it--> when we are not sure about how many values we want to store.
		System.out.println(num);// memory address of the array
		System.out.println(num[0]);// value at index 0
		System.out.println(num[5]);
		System.out.println(num.length);// length of the array
		System.out.println(Arrays.toString(num));// print the array

		for (int e : num) {
			System.out.println(e);
		}

		System.out.println("--------------------------------------------------");

		String name[] = { "Pooja", "Riya", "Siya", "Priya", "Vihan" };
		System.out.println(Arrays.toString(name));
		int count = 0;
		for (String e : name) {
			System.out.println(count + " = " + e);
			count++;
		}
		System.out.println("=======================================");

		for (int i = 0; i < name.length; i++) {
			System.out.println(i + " = " + name[i]);
		}
		System.out.println("----------------------------------------------------");

		Object empinfo[] = { "Pooja", 32, "21-05-1990", 34.50f, true, 'f' };

		System.out.println(Arrays.toString(empinfo));
		int count1 = 0;
		for (Object e : empinfo) {
			System.out.println(count1 + " = " + e);
			count1++;
		}

		System.out.println("=======================================");

		for (int i = 0; i < empinfo.length; i++) {
			System.out.println(i + " = " + empinfo[i]);
		}
		System.out.println("----------------------------------------------------");
		for (int i = empinfo.length - 1; i >= 0; i--) {
			System.out.println(i + " = " + empinfo[i]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println("---------------------------------------------------------");
// printing the value of counter--wrong program
		int i[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int count12 = i.length - 1;
		for (int e : i) {
			e = count12;
			System.out.println(e);
			count12--;
		}
		System.out.println("-------------------------------------------------------------------");
		int I[] = { 1, 2, 3, 4, 5, 56, 7, 8, 9, 10 };
		int c = I.length - 1;
		for (int e : I) {
			e = c;
			System.out.println(I[e]);
			c--;
		}
		System.out.println("------------------------------------------------------------------");
		String s[] = { "Pooja", "Tom", "Priya", "Nisha", "Richa" };
		for (int h = s.length - 1; h >= 0; h--) {
			System.out.println(s[h]);
		}

	}

}
