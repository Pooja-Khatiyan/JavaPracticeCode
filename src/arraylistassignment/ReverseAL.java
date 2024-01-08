package arraylistassignment;

import java.util.ArrayList;

public class ReverseAL {

	public static void main(String[] args) {
//Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");

		for (int i = studentNames.size() - 1; i >= 0; i--) {
			System.out.println(studentNames.get(i));
		}

	}

}
