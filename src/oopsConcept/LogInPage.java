package oopsConcept;

public class LogInPage {
//WAF--for login
//1)username,password
//2)username,password,otp
//3)username,password,phoneno
//4)emailId	

	public void login(String name, String password) {
		System.out.println(name + " " + password);
	}

	public void login(String name, String password, int otp) {
		System.out.println(name + " " + password + " " + otp);
	}

	public void login(String name, int phoneno, String password) {
		System.out.println(name + " " + phoneno + " " + password);
	}

	public void login(String email) {
		System.out.println(email);
	}
//shopping to overload search
//a)product name
//b)product name,price
//c)product name, color , price
//d)product name, saller, discount,age.....etc
	
//payment method overloading
//a)String upi
//b)String cc, int cvv
//c)String paypalId, String password
	
//uber booking
//a)cartype, stpoint,endpoint
//b)cartype,stpoint,endpoint,no of f
	public static void main(String[] args) {
		LogInPage l = new LogInPage();
		l.login("pooja.insan@gamil.com");
		l.login("Pooja", "fyugsgs", 1878);
	}

}
