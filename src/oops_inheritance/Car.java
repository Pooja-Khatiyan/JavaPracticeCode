package oops_inheritance;

//from parents/grand parents to child is allowed reverse is not allowed
//a parent can have multiple child but vice verse is not allowed
//WE CAN HAVE ONLY & ONLY ONE PARENT
//parents can have n no. of child class---no restriction is there
//before using EXTENDS keyword we have to practically /logical achieve the IS-A RELTIONSHIP
//parents class methods are automatically inherited to child  class--CODE REUSABILITY-- biggest advantage of this concept.
//overriding of parent class methods are allowed
//in every class inheritance ,individual & overridden methods are allowed/possible.
//sibling/child inheritance is not allowed.
//one class having multiple parent classes/diamond problem/multi-angled class--not allowed in java--resolve via interfaces
//child to parent inheritance is not allowed parent cannot inherit methods/property/variables from child class
public class Car extends Vehicle {
//there is no concept of variable overriding	
	final int price = 5000;
	static String color = "Black";
	int maxspeed = 100;
//method with return
	public int gearchangecheck() {
		System.out.println("Car Gear Change Check");
		return 100;
	}

	public void start() {
		System.out.println("Car Start");
	}

	public void stop() {
		System.out.println("Car Stop");
	}

	public void refuel() {
		System.out.println("Car Refuel");
	}

	public static void gearcheck() {
		System.out.println("Car Gear Check");
	}

//static method can not be overridden
	public static void vehiclebilling() {
		System.out.println("Car Billing");
	}

	public void tyre() {
		System.out.println("Car Tyre Check");
		tyrepressure();
	}

//private method can not be overridden
	private void tyrepressure() {
		System.out.println("Car Tyre Pressure");
	}

	protected void selling() {
		System.out.println("Car Selling");
	}

	void payment() {
		System.out.println("Car Payment");
	}

	void tyreType() {
		System.out.println("Tyre Type");
	}

//final -overridden not possible--due to final keyword it is preventing method hiding
	public final static void testing() {
		System.out.println("Car Testing");
	}

//to prevent the method inheritance /overriding we use the FINAL KEYWORD.
}
