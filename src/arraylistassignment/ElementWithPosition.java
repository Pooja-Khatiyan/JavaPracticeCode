package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementWithPosition {

	public static void main(String[] args) {
//Write a Java program to print all the elements of an ArrayList using the position of the elements.		
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		int count = 0;
		for (String e : Color) {
			System.out.println("At Index " + count + " = " + e);
			count++;
		}

	}

}
