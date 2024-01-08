package constructorcocept;

//user registration feature in e commerce site
//practically in user class we never create main method--whenever we are creating a template it is bad practice to have
//main method in that itself.if we are having 100 class is we are going to create 100 main method NOOOOOOO
public class User {
//global variable/instance variable/object variable
	String name;
	String email;
	int userid;
	String dob;
	String city;

//to create const.. go to source--> generate const.. using field
//create the user on the basis of below option
//1. name
//2. name,email
//3. name,email,dob
//4. name,email,userid,dob,city
//5. name,city
	public User(String name) {
		this.name = name;
	}

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public User(String name, String email, String dob) {
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	public User(String name, String email, int userid, String dob, String city) {
		this.name = name;
		this.email = email;
		this.userid = userid;
		this.dob = dob;
		this.city = city;
	}

// business logic should be write inside the method not inside the const..
//give me the user order detail --functionality	
	public String[] getUserOrderDetails(String name) {// pass the name and get detail
		if (name.equals("avni")) {
			String orderDetails[] = { "Laptop", "Mouse", "usb Cable" };
			return orderDetails;
		} else if (name.equals("pooja")) {
			String orderDetails[] = { "Laptop", "Mouse" };
			return orderDetails;
		} else {
			return null;
		}

	}

}
