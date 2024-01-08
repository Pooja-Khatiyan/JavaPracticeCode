package pack1;

public class Truck {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
		// System.out.println(c.price); private are not accessible
		System.out.println(c.name);
		System.out.println(c.modelnumber);
		Truck t = new Truck();
		System.out.println(c.color);
//System.out.println(c.price); //private are not accessible
		System.out.println(c.name);
		System.out.println(c.modelnumber);
	}

}
