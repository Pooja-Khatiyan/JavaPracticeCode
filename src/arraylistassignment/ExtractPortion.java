package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractPortion {

	public static void main(String[] args) {
//Write a Java program to extract a portion of an array list.
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		ArrayList<String> portion = new ArrayList<String>(Color.subList(1, 4));
		System.out.println(portion);
		for (int i = 4; i < Color.size(); i++) {
			System.out.println(Color.get(i));
		}
	}

}
