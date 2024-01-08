package methodassignment;

public class ValidVoter {
	public boolean validvoter(int age) {
  boolean flag = false ;
		if (age <= 0) {
			System.out.println("INAVID ENTRY,PLEASE CHECK AND ENTER");
			flag = false;
		} else if (age >= 18) {
			System.out.println("Age is 18 and above : VALID VOTER");
			flag = true;
		} else {
			System.out.println("Age is below 18 : INVALID VOTER");
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
// A person is eligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is eligible to﻿ vote. - return true/false
		ValidVoter obj = new ValidVoter();
		boolean voter = obj.validvoter(-1);
		System.out.println(voter);

	}

}
