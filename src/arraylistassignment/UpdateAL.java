package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateAL {

	public static void main(String[] args) {
//Write a Java program to update specific array element by given element.
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		// System.out.println(Color.set(4, "Silver"));
		Color.add(6, "Peach");// upgrade--shifting
		System.out.println(Color);
		Color.set(7, "Silver");// updated--data lost
		for (int i = 0; i < Color.size(); i++) {
			System.out.println(Color.get(i));
		}

	}

}
