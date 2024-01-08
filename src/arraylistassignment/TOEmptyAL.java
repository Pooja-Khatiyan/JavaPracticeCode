package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class TOEmptyAL {

	public static void main(String[] args) {
//Write a Java program to empty an array list

		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		Color.clear();

		System.out.println(Color);
	}

}
