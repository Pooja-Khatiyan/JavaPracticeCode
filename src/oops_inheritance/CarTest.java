package oops_inheritance;

//TOP/UP casting
public class CarTest {
//child class object can be referred by parent/grand parent class reference variable
	public static void main(String[] args) {

		Physics p = new BMW();

		p.distancecheck();
		p.velocitycheck();
		// p.start(); parent can not inherit any property from child class--REFERENCE
		// TYPE CHECK--FAILS

		Car c = new BMW();
		c.start();
		c.engine();
		c.pressurecheck();
		c.designtesting();
		c.operationcheck();
		c.velocitycheck();
		// c.autoparking();parent can not inherit any property from child
		// class--REFERENCE TYPE CHECK--FAILS
		c.vehiclebilling();//this is static method not part of object,object reference has to cross stack memory to refer it
		BMW.vehiclebilling();
		Car.vehiclebilling();
		Vehicle.vehiclebilling();
		System.out.println(c.maxspeed);

//DOWN CASTING --not allowed in java --becz reference type check fail	
//parent class object can be referred by child class ref variable?? NOOOOOOOOO		
		// BMW b = new Car (); //every car is BMW how could we say that
		System.out.println("---------------------------");
//CLASSCASTEXCEPTION

//BMW b = (BMW)new Car ();//forcefully we are casting/converting type of car to BMW we are making fool of compiler,but
// run time we will get the error.
//down casting is not satisfying IS-A RELATIONSHIP,java go & check reference type check

//if a method declare with FINAL/STATIC/PRIVATE KEYWORD --it can't be Overridden
//final class can't be a parent class.		

	}

}
