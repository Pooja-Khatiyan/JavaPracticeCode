package sOOPs_Encapsulation;

//encapsulation means encapsulate private data member with the public layer-- from main method we have indirect access to 
//private variable through getter/setter method.it's upto me to which variable i want to give the access
public class Employee {
	private String name;
	private int id;
	private String city;
	boolean isPerm;

	// to set values through const..
	public Employee(String name, int id, String city, boolean isPerm) {
		this.name = name;
		this.id = id;
		this.city = city;
		this.isPerm = isPerm;
	}

//creating setter/getter
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

}
