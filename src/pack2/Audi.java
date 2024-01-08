package pack2;

import pack1.Car;

public class Audi extends Car {
//different package --sub class
	public static void main(String[] args) {
		Audi a = new Audi();
		System.out.println(a.color);
		// System.out.println(a.price);private
		System.out.println(a.name);
		// System.out.println(a.modelnumber);default
		System.out.println("-------");
		// it is not a sub class it is a super class
//		 Car c = new Car();
//		System.out.println(c.color);
//		System.out.println(c.price);// private
//		System.out.println(c.name);
//		System.out.println(c.modelnumber);// default
	}

}
