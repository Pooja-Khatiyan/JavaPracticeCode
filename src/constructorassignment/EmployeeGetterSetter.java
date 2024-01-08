package constructorassignment;

public class EmployeeGetterSetter {
	int id;
	String name;
	double salary;

//with the help of const.. we set the values--const.. is behave like setter 
	public EmployeeGetterSetter(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

//Create a Java class named "Employee" with the following instance variables:
//id (int)
//name (String)
//salary (double)
//Create a constructor for the Employee class that takes in the id, name, and salary as parameters
//and initializes the instance variables.Create getter methods for each of the instance variables.
//Create a main method that creates an instance of the Employee class using the constructor, prints 
//out the employee's information using the getter methods, and gives the employee 		
//a 10% raise using the setter method for the salary instance variable.		

//1--What is the purpose of a getter method in Java?
//we use it to get the value,to fetch the value 

//2--Can a getter method return void?
//no as it is returning some value 

//3--What is the access level of a getter method in Java?

//4--What is the purpose of a setter method in Java?
//we use it to initialize the value in place of setter we can also use const...
//SETTER IS USE TO UPDATE THE VALUE

//5--Can a setter method return a value other than void?
//
