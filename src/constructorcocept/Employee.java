package constructorcocept;

public class Employee {
	String name;
	int id;
	double salary;

	// constructor overloading
//full control on object creation
	public Employee(String name) {// 1 para
		this.name = name;
	}

	public Employee(String name, int id) {// 2 para
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, double salary) {// 3 para
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee e = new Employee("Priya");
		System.out.println("[ " + e.id + " " + e.name + " " + e.salary + " ]");

		Employee e1 = new Employee("Priya", 10);
		e1.salary = 32.90;// option to update salary when we have
		System.out.println("[ " + e1.id + " " + e1.name + " " + e1.salary + " ]");

		Employee e2 = new Employee("Priya", 90, 67.81);
		System.out.println("[ " + e2.id + " " + e2.name + " " + e2.salary + " ]");

		Employee e3 = new Employee(null, 0, 0.0);
// as we have const.. of 3 parameter we can create this object but it is not right way
//this is not null obj, we call it null it null obj when e3 pointing to null
//this is object having default values. 
		System.out.println("[ " + e3.id + " " + e3.name + " " + e3.salary + " ]");

	}

}
