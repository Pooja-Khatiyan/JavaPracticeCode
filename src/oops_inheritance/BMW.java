package oops_inheritance;

public class BMW extends Car {
	// The type BMW cannot subclass the final class Car
	int maxspeed = 200;
	static String color = "White";
	final int price = 10000;

//method with return--override --should have same method signature i.e method name & return type
	@Override
	public int gearchangecheck() {
		System.out.println("Car Gear Change Check");
		return 400;// it should return some int value that can be anything
	}

	@Override
	public void start() {
		System.out.println("BMW Start");
	}

	public void autoparking() {
		System.out.println("BMW Auto Parking");
	}

	@Override
	public void engine() {
		System.out.println("BMW engine");
	}

	@Override
	public void velocitycheck() {
		System.out.println(" BMW Velocity Check");
	}
	// @Override--it is not overriding static method can not be override as they are
	// not the part of object this concept is called METHOD HIDING

	public static void gearcheck() {
		System.out.println("BMW Gear Check");
	}

	public static void vehiclebilling() {
		System.out.println("BMW Billing");
	}

	private void tyrepressure() {
		System.out.println("Car Tyre Pressure");
	}

//Protected can be overridden
//protected to protected overriding is possible as well as protected to public is also allowed.
	// doubt after save it showing error
	@Override
	public void selling() {
		System.out.println("Car Selling");
	}

	@Override // default to public
	public void payment() {
		System.out.println("BMW Payment");
	}

	@Override
	protected void tyreType() {
		System.out.println("Tyre Type");
	}
	// final -overridden not possible--due to final keyword it is preventing method
	// hiding
//	public final static void testing() {
//		System.out.println("Car Testing");
//	}
//	public void selling () {//duplicate of above 
//		System.out.println("Car Selling");
//	}
}
