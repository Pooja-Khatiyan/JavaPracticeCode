package javatopics;

import java.util.Arrays;

public class TwoDimensionArrayConcept {

	public static void main(String[] args) {

		int twod[][] = new int[4][5];
		twod[0][0] = 100;
		twod[0][1] = 200;
		twod[1][0] = 300;
		twod[1][1] = 400;
		twod[2][1] = 700;
		twod[3][3] = 1000;
		System.out.println(Arrays.toString(twod));// memory address
		System.out.println(twod.length);// row value
		for (int row = 0; row < twod.length; row++) {
			for (int col = 0; col < twod.length; col++) {
				System.out.print(twod[row][col] + " ");
			}
			System.out.println();
		}
System.out.println("----------------------");
for(int [] row : twod)
{
for(int e : row)
{
System.out.print(e + " ");	
}
System.out.println();
}
	
	
	
	
	
	}

}
