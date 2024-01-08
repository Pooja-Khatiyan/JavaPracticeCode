package methodassignment;

public class GradeWithMarks {
	public String gradeOfStudent(int marks) {
		String result = "";
		if (marks > 90 && marks < 101) {
			result = "AA";
		} else if (marks > 80 && marks < 91) {
			result = "AB";
		} else if (marks > 70 && marks < 81) {
			result = "BB";
		} else if (marks > 60 && marks < 71) {
			result = "BC";
		} else if (marks > 50 && marks < 61) {
			result = "CD";
		} else if (marks > 40 && marks < 51) {
			result = "DD";
		} else {
			result = "FAIL";
		}

		return result;
	}

	public static void main(String[] args) {
// Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB﻿
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
		GradeWithMarks obj = new GradeWithMarks();
		String stdResult = obj.gradeOfStudent(91);
		System.out.println(stdResult);

	}

}
