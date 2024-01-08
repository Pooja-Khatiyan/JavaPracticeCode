package methodassignment;

public class ProductDoubleNO {
	public double product(double a, double b) {
		System.out.println("Product Method...");
		double multiple = a * b;
		return multiple;
	}

	public static void main(String[] args) {
//Define a method that returns the product of two double numbers entered by user.
		ProductDoubleNO obj = new ProductDoubleNO();
		double multiple = obj.product(12.0, 5.0);
		System.out.println(multiple);

	}

}
