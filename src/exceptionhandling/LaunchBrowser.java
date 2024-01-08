package exceptionhandling;

public class LaunchBrowser {

	public static void main(String[] args) {
		String browser = "opera";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("firefox is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;

		default:
			System.out.println("please pass the right browser name...");
			throw new AppException("INVAIL BROWSER EXCEPTION");
		// break;
		}
		System.out.println("enter the url");
		System.out.println("click on signup button");
	}

}
