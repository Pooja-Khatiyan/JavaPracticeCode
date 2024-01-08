package superkeyword;

public class BMW extends Car {
	int speed = 120;

	public BMW() {
		// super(20);
		super(20, 30);
		System.out.println("BMW-- const..");
	}

	public BMW(int p) {
		this();
		System.out.println("BMW-- const.." + p);

	}

	@Override
	public void displayInfo() {
		System.out.println("BMW-- Info");
	}

	public void displayBMWInfo() {
		System.out.println("BMW-- System Info");
		System.out.println(speed);
		System.out.println(super.speed);
		displayInfo();
		super.displayInfo();
	}
}
