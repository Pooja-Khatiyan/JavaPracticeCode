package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementAL {

	public static void main(String[] args) {
//Write a Java program to remove the third element from an array list.
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		// System.out.println(Color.remove(3));
		Color.remove(3);
		System.out.println(Color.size());
		System.out.println(Color);

	}

}
