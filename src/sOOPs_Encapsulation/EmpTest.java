package sOOPs_Encapsulation;

//Always use const... along with setter & getter
public class EmpTest {

	public static void main(String[] args) {
//		Employee e = new Employee ();
//		e.setName("Neha");
//		e.setCity("Pune");
//		e.setId(1);
//		e.setPerm(true);
//		System.out.println(e.getCity());
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.isPerm());
//set value through const.. & fetching through getter	
//user registration	:SETTER/CONSTRUCTOR : Create :POST API
		Employee e = new Employee("Neha", 1, "Pune", true);
//display info on user profile:getter:retrieve:GET API
		System.out.println(e.getCity());
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.isPerm());
//without setter method information updation is not possible :SETTER : UPDATE :PATCH/PUT API
//update employee information name to full name and city changed to banglore
		e.setName("Neha yadav");
		e.setCity("Banglore");
		System.out.println(e.getCity());
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.isPerm());

	}

}
