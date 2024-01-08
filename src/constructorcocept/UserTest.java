package constructorcocept;

import java.util.Arrays;

import testing.Customer;

//it behave like caller class
// in object oriented programming never write the main method in the template class.
public class UserTest {
//let suppose it is amazon.com end UI
	public static void main(String[] args) {
//for creating object/user we use constructor concept
		User u1 = new User("avni");
		u1.getUserOrderDetails("avni");
		System.out.println(Arrays.toString(u1.getUserOrderDetails("avni")));
		System.out.println(Arrays.toString(u1.getUserOrderDetails("pooja")));
//or we can fetch this way
	String avniDetails[] = u1.getUserOrderDetails("avni");
	System.out.println(Arrays.toString(avniDetails));
//User u2 = new User(); restricted unnecessary object creation
		User u3 = new User("Priya", "priya21@gmail.com");
		ConstructorConcept c = new ConstructorConcept();
		Customer c1 = new Customer("pooja", 30, true);
//to know from where constructor is coming control+click on class name.
//cThe field Customer.name is not visible --as we are calling outside the package and name is
//not public to access it outside the package we have to declare that variable as public

		System.out.println(c1.name + " " + c1.age + " " + c1.isActive);

	}

}
