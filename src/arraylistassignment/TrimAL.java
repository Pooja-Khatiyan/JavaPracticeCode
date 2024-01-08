package arraylistassignment;

import java.util.ArrayList;

public class TrimAL {

	public static void main(String[] args) {
//Write a Java program to trim the virtual capacity of an array list the current list size.
		ArrayList<String> studentNames = new ArrayList<String>(20);
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		studentNames.add("Herry");
		studentNames.add("John");
		studentNames.add("Joseph");
		studentNames.add("Joe");
		studentNames.trimToSize();
		System.out.println(studentNames);
//in this case load factor will be ignore after filling predefine VC it keep on increasing only 9 VC everytime.		
	}

}
