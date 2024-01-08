package pack1;

public class BMW extends Car{

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.color);
		//System.out.println(c.price);outside class private data member are not accessible
		System.out.println(c.name);
		System.out.println(c.modelnumber);
		
		BMW b = new BMW();
		System.out.println(c.color);
		//System.out.println(c.price);//outside class private data member are not accessible
		System.out.println(c.name);
		System.out.println(c.modelnumber);
	}

}
