package methodassignment;

public class CircleParameterCalculation {
	public double circleCircumference(double radius) {
		double Circumference = 2 * Math.PI * radius;
		return Circumference;
	}

	public double circleArea(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;

	}

	public static void main(String[] args) {
//Write a program to print the circumference and area of a circle of radius entered by 
//user by defining your own method. 

		CircleParameterCalculation obj = new CircleParameterCalculation();
		double area = obj.circleArea(7);
		System.out.println(area);
		double Circumference = obj.circleCircumference(7);
		System.out.println(Circumference);

	}

}
