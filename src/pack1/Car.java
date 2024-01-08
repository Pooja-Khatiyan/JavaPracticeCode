package pack1;

public class Car {
	public String name;
	protected String color;
	private int price;
	int modelnumber;
	
//with in same class
	public static void main(String[] args) {
		Car c = new Car ();
	System.out.println(c.color);
	System.out.println(c.name);
	System.out.println(c.price);
	System.out.println(c.modelnumber);
		
	}

}
