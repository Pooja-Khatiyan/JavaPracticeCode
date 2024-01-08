package constructorassignment;

public class Rectangle {
	double length;
	double width;

	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area(double length, double width) {
		double area = length * width;
		return area;
	}

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10,40);
	   double area = obj.area(10, 50);
		System.out.println(area);
		Rectangle cal = new Rectangle();//default const.. calling 
		double area1 = cal.area(10,20);
		System.out.println(area1);
//1--What is the purpose of a default constructor in Java?
//in case we doesn't created any constructor that helps us to create object of the class
//How can you differentiate between a default constructor and a constructor that takes in parameters?
//with the number of passed parameters
//What is the access level of a constructor in Java?
//Can a constructor be private? If so, why would you want to make a constructor private?
//yes,in helps in preventing inheritance.
//Can a constructor call a method from another class? 



	}

}
