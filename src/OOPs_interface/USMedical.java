package OOPs_interface;
//a method which has no method body is called abstract method-- only declaration.

//we can have n no of parent interface
//doesn't have method body--only & only method declaration--have abstract method--we can not write business logic.
//by default all methods in interface are always abstract in nature,it's not mandatory to write abstract keyword.
//we can not create the object of Interface in java-- Strictly not allowed--as it doesn't have any logic/method body.
//top casting is allowed in java with the help of interface.
//by default all the variable inside the interface are static & final in nature.

public interface USMedical extends WHO{
	// class variables are by default final & static in nature
	int min_fee = 10;

//all abstract methods are non static  
	public void physioServices();

//public abstract void physioServices();//same as above
	public void oncologyServices();

//public static void oncologyServices();--we cannot override the static method not allowed--final& static method cannot be overridden	
	public void pediaServices();

	public void emergencyServices();

//overloading is allowed
	public void physioServices(int a);
//	public String physioServices();Duplicate method physioServices() in type USMedical

//after jdk 1.8v default & static method are allowed with method body in interface i.e we can say that interface is now
//not 100% abstraction.--now it is not 100% abstraction
//1)we can have static method with method body: now allowed--method hiding--n no of static methods are allowed
//overriding with static is not allowed it is over hiding
	public static void billing() {
		System.out.println("USMedical-- billing");
	}

//we can override with only public modifier
// 2)we can have default case also with method body:non static
	default void RnD() {
		System.out.println("USMedical-- RnD");
	}

}
