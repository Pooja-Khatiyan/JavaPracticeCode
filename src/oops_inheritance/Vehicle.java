package oops_inheritance;

//METHOD OVERRIDDING
//condition-- when we have parents & child classes ---
//a)with the same method name
//b)with the same no. of parameter/order of sequence
//c)with the same return type
//should have same method signature.
//if we keep the same business logic in overridden method then what's the logic to override
//also called DYNAMIC/LATE BINDING/RUN TIME POLYMORPHISM
public class Vehicle extends AutomobileEngineering {
	public void engine() {
		System.out.println("Vehicle Engine");
	}

	@Override
	public void speedcheck() {
		System.out.println("Vehicle Speed Check");
	}

	public static void vehiclebilling() {
		System.out.println("Vehicle Billing");
	}
}
