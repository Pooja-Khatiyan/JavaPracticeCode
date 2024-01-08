package superkeyword;

//PROPERTY OF SUPER KEYWORD
//1) in the child class const.. , but it should be the 1st statement in the child class const..
//2)when you have same property(overridden method /same variable) in the child & parent class ,but you
//want to call/acess parent class properties --use super keyword--anywhere in method
public class Car {
	int speed = 100;

	public Car() {
		System.out.println("Car-- Const..");
	}

	public Car(int a) {
		System.out.println("Car-- Const.." + a);
	}
	public Car(int a, int b) {
		System.out.println("Car-- Const.." + (a+b));
	}

	public void displayInfo() {
		System.out.println("Car-- Info");
	}

}
