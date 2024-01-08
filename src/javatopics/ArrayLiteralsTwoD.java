package javatopics;

import java.util.Arrays;

public class ArrayLiteralsTwoD {

	public static void main(String[] args) {
//with new keyword
		int marks[][] = new int[2][4];
		marks[0][0] = 100;
		marks[0][1] = 200;
		marks[0][2] = 400;
		marks[0][3] = 300;
		marks[1][0] = 500;
		marks[1][1] = 600;
		marks[1][2] = 700;
		marks[1][3] = 900;
		System.out.println(Arrays.deepToString(marks));
		for (int[] row : marks) {
			for (int e : row) {
				System.out.print(e + " ");
			}
			System.out.println("");
		}

		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//with array literals
		int num[][] = { { 10, 20, 30, 40 }, { 20, 30, 40, 50 }, { 30, 40, 50, 60 }, { 70, 80, 90, 100 } };

		System.out.println(num);
		System.out.println(num.length);
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num.length; col++) {
				System.out.print(num[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(num.length);
		System.out.println("----------------------------------------------------");
		System.out.println(Arrays.deepToString(num));// direct method
		System.out.println("----------------------------------------------------");
//for each loop		
		for (int[] row : num) {
			for (int e : row) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------");

		Object empinfo[][] = { { "Pooja", 25, true, 'f', 35.67, "21-05-1990" },
				{ "Neha", 35, false, 'f', 28.89, "01-05-1998" }, { "Shiva", 30, true, 'm', 30.90, "21-09-2001" },
				{ "Zoyi", 42, true, 'f', 40.56, "30-11-2002" } };

		System.out.println(empinfo.length);
		for (int row = 0; row < empinfo.length; row++) {
			// for (int col=0; col<empinfo.length ; col++)//as it take only row length which
			// is 4 in this case
			for (int col = 0; col < empinfo[0].length; col++) {
				System.out.print(empinfo[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------");
//with for each loop 
		for (Object[] row : empinfo) {
			for (Object e : row) {
				System.out.print(e + "  ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------------------------");
// to iterate 2-D array without loop
		System.out.println(Arrays.deepToString(empinfo));

	}

}
