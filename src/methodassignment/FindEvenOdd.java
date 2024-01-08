package methodassignment;

public class FindEvenOdd {
	public boolean evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is " + "even number");
			return true;
		} else {
			System.out.println(a + " is " + "odd number");
			return false;
		}
	}

	public static void main(String[] args) {
//Def﻿ine a program to find out whether a given number is even or odd - return true/false.		
		FindEvenOdd obj = new FindEvenOdd();
		boolean result = obj.evenOdd(12);
		System.out.println(result);

	}

}
