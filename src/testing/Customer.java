package testing;

//in oops never create main method inside template class
//customer class is not responsible to create object/to create main method / call method
public class Customer {
//to access outside the package must declare global variable as public
	public String name;
	public int age;
	public boolean isActive;

	public Customer(String name, int age, boolean isActive) {

		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

}
