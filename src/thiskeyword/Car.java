package thiskeyword;

public class Car {

	int speed = 100;

	public Car() {
		System.out.println("Car-- Const..");
	}

	public Car(int a) {
		this(20, 30);
		System.out.println("Car-- Const.." + a);
	}

	public Car(int a, int b) {
		this();
		System.out.println("Car-- Const.." + (a + b));
	}

	public void displayInfo() {
		System.out.println("Car-- Info");
	}

}
