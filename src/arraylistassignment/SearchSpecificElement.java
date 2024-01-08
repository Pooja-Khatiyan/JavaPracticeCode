package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchSpecificElement {

	public static void main(String[] args) {
//Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		String searchcolor = "Pink";
		
		for (String e : Color) {
			if (e.equals(searchcolor)) {
				System.out.println("COLOR FOUND: " + searchcolor);
				break;
			} else {
				System.out.println(e);
			}

		}

	}

}
