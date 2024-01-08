package beginnersProgram;

public class Customer {
	String name;
	String age;
	String phoneNo;

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.name = "Pooja";
		c1.phoneNo = "8737826489";
		Customer c2 = new Customer();
		c2.name = "Indu ";
		c2.phoneNo = "9897826489";
		Customer c3 = new Customer();
		c3.name = "Kishor";
		Customer c4 = new Customer();
		c4.name = "Aahan";
		System.out.println(c1.name + " " + c1.age + " " + c1.phoneNo);
		System.out.println(c2.name + " " + c2.age + " " + c2.phoneNo);
		System.out.println(c3.name + " " + c3.age + " " + c3.phoneNo);
		System.out.println(c4.name + " " + c4.age + " " + c4.phoneNo);
		System.out.println("**********");

		c1 = c2;
		System.out.println(c1.name + " " + c1.age + " " + c1.phoneNo);// indu
		System.out.println(c2.name + " " + c2.age + " " + c2.phoneNo);// indu
		System.out.println(c3.name + " " + c3.age + " " + c3.phoneNo);// kishor
		System.out.println(c4.name + " " + c4.age + " " + c4.phoneNo);// aahan
		System.out.println("**********");

		c2 = c3;
		System.out.println(c1.name + " " + c1.age + " " + c1.phoneNo);// indu
		System.out.println(c2.name + " " + c2.age + " " + c2.phoneNo);// kishor
		System.out.println(c3.name + " " + c3.age + " " + c3.phoneNo);// kishor
		System.out.println(c4.name + " " + c4.age + " " + c4.phoneNo);// aahan
		System.out.println("**********");

		c3 = c4;
		System.out.println(c1.name + " " + c1.age + " " + c1.phoneNo);// indu
		System.out.println(c2.name + " " + c2.age + " " + c2.phoneNo);// kishor
		System.out.println(c3.name + " " + c3.age + " " + c3.phoneNo);// aahan
		System.out.println(c4.name + " " + c4.age + " " + c4.phoneNo);// aahan
		System.out.println("**********");

		c4 = c1;
		System.out.println(c1.name + " " + c1.age + " " + c1.phoneNo);// indu
		System.out.println(c2.name + " " + c2.age + " " + c2.phoneNo);// kishor
		System.out.println(c3.name + " " + c3.age + " " + c3.phoneNo);// aahan
		System.out.println(c4.name + " " + c4.age + " " + c4.phoneNo);// indu

	}

}
