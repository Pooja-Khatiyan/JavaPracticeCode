package pack2;

import pack1.Car;

public class Cycle {

	public static void main(String[] args) {
		Car c = new Car();
		// System.out.println(c.color);// protected
		// System.out.println(c.price);// private
		System.out.println(c.name);// public
		// System.out.println(c.modelnumber);// default

	}

}
