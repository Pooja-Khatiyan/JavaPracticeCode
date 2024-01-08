package oopsConcept;

public class Car {
//we didn't define any constructor here--in background jvm will add one default/hidden constructor i.e we are able to create object
//if we define our const.. then preference is given to defined const...
//prob with default const.. is anyone can create the object now--there is no restriction now	
	String name;
	int price;
	String LicenseNumber;
//int wheels;//same for all car type so should be assign static --1 copy in cma
	// static int wheels = 4;
//any one can change the no of wheels &it will change the entire logic of the program or we can say that there is a bug
//in program to solve it/fix it we have to restrict it.
	final static int wheels = 4;

//static final int wheels =4; both are same 
//object will never hold the static property --CMA
//CMA-common memory allocation/permanent generation(fixed size) after jdk 1.8 it is called meta space.
//non-static can be access with the help of object creation.
//how to call static variable?
//a)if we are having static variable within class we can access them directly else by class reference.
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.LicenseNumber = "123341BMW";
//c1.wheels=4;

		Car c2 = new Car();
		c2.name = "AUDI";
		c2.price = 70;
		c2.LicenseNumber = "123455AUDI";
//c2.wheels=4;	

		Car c3 = new Car();
		c3.name = "HONDA";
		c3.price = 20;
		c3.LicenseNumber = "12988HONDA";
//c3.wheels=4;	
		System.out.println(wheels);// directly
		System.out.println(Car.wheels);// with class name
		System.out.println(c1.name + " " + c1.LicenseNumber + " " + c1.price);// with object reference
		System.out.println(c2.name + " " + c2.LicenseNumber + " " + c2.price);// object creation is mandatory for
																				// non-static variables
		System.out.println(c3.name + " " + c3.LicenseNumber + " " + c3.price);
//System.out.println(car.name);name is non-static store in object--specific to object not to the class
//1000 employees working in IBM --static variable among them is company name.

	}

}
