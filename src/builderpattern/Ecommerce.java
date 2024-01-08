package builderpattern;

public class Ecommerce {

	public Ecommerce login() {
		System.out.println("user is logged in :");
		return this;
	}

	public Ecommerce login(String un, String pwd) {
		System.out.println("user is logged in with : " + un + " " + pwd);
		return this;
	}

	public Ecommerce search(String productName) {
		System.out.println("Searching Product : " + productName);
		return this;
	}

	public Ecommerce search(String productName, String color) {
		System.out.println("Searching Product : " + productName + " " + color);
		return this;
	}

	public Ecommerce selectProduct(String productName) {
		System.out.println("Selecting Product : " + productName);
		return this;
	}

	public Ecommerce addToCart(String productName) {
		System.out.println("Adding Product In The Cart : " + productName);
		return this;
	}

	public Ecommerce doPayment(String cc, int cvv) {
		System.out.println("Making Payment Using Card : " + cc + ": " + cvv);
		return this;
	}

	public Ecommerce generateOrderID() {
		System.out.println("Order ID is : " + 12354);
		return this;
	}

	public Ecommerce logout() {
		System.out.println("LogOut");
		return this;
	}

}
