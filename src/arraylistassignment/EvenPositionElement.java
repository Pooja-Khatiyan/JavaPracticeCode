package arraylistassignment;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenPositionElement {

	public static void main(String[] args) {
//wap to print all even nos. colors
		ArrayList<String> Color = new ArrayList<String>(
				Arrays.asList("Red", "Blue", "Green", "Pink", "Brown", "Yellow", "White", "Black"));
		for (int i = 0; i < Color.size(); i++) {
			if (i % 2 == 0) {
				System.out.println("Element At Even Index " + i + " = " + Color.get(i));
			} else {
				System.out.println("Elemnt At Odd Index   " + i + " = " + Color.get(i));
			}

		}

	}

}
