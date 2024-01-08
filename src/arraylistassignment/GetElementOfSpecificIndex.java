package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class GetElementOfSpecificIndex {

	public static void main(String[] args) {
//Write a Java program to retrieve an element at a specified index from a given array list		
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		System.out.println(Color.get(6));

	}

}
