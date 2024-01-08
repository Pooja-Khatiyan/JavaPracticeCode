package oops_inheritance;

public class TestCar {
public static void test() {
	System.out.println("Test Method");
}
	public static void main(String[] args) {
		BMW b = new BMW();
		test();
		b.autoparking();// individual
		b.start();// overridden
//without extends keyword inheritance doesn't happened.
		b.stop();// inherited
		b.refuel();// inherited---reusability
		b.engine();
		b.speedcheck();
		b.velocitycheck();
		b.gearcheck();
		b.vehiclebilling();
		BMW.vehiclebilling();
		Car.vehiclebilling();
		Vehicle.vehiclebilling();
		b.tyre();
		System.out.println(b.maxspeed);
		System.out.println(b.color);

		// physics.vehiclebilling();vehiclebilling is static method so how could we
		// access that with different class name.that
//method is not available inside that class.
		System.out.println("----");
		Car c = new Car();
		c.engine();
		c.gearcheck();
		c.vehiclebilling();
		c.tyre();
		System.out.println(c.maxspeed);
		System.out.println(c.color);
		System.out.println(b.price);
		System.out.println("-----");
		Vehicle v = new Vehicle();
		v.vehiclebilling();
		AutomobileEngineering a = new AutomobileEngineering();
		a.distancecheck();
		a.manufacturingtesting();
	}

}
