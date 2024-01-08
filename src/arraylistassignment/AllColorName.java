package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class AllColorName {

	public static void main(String[] args) {
// 1. Write a Java program to create a new array list, which contains all color names.--add some colors (string) 
//---and print out the colorslist using loops.
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		for (String e : Color) {
			System.out.println(e);
		}
		System.out.println(Color.size());
		Color.add("Gray");
		Color.add("Peach");
		Color.add("Purple");
		Color.add("Violet");
		System.out.println(Color);
		System.out.println(Color.size());
	}

}
