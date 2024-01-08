package OOPs_Abstract;

public class LoginPage extends Page {

	@Override
	public void title() {
		System.out.println("LP--Title");
		
	}

	@Override
	public void url() {
		System.out.println("LP--url");
	}
	@Override
	public void pageLoadTime () {
		System.out.println("Page load time out = 2 secs ");
	}
public void doLogin(String un , String pwd) {
	System.out.println("logged in user with: " +un +" " + pwd );
}
	public LoginPage () {
		System.out.println("LoginPage constructor");
	}
	public LoginPage (int a ) {
		super(a);
		System.out.println("LoginPage constructor " + a);
	}

	
	
}
