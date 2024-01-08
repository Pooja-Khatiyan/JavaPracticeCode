package webdriverarch;

import exceptionhandling.AppException;

public class AmazonTest {
	static WebDriver driver;

	public static void main(String[] args) {
		// IE
		// IEDriver driver = new IEDriver();
		// Edge
		// EdgeDriver driver = new EdgeDriver();
		// Firefox
		// FireFoxDriver driver = new FireFoxDriver();
		// Safari
		// SafariDriver driver = new safariDriver();
// to avoid comment out above driver we use top casting concept	
		// ChromeDriver driver = new ChromeDriver();

		String browser = "Chrome";
		switch (browser.trim()) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "FireFox":
			driver = new FireFoxDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "IE":
			driver = new IEDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser name... " + browser);
			throw new AppException("BROWSER EXCEPTION");
			//break;
		}
		driver.get("https://www.amazon.com");// in other case we get NPE as default value of driver is NULL
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement("EmailID");
		driver.findElement("Password");
		driver.sendkey("EmailID", "admin@gmail.com");
		driver.sendkey("Password", "admin@12");
		driver.click("Login Button");
		driver.close();
throw new AppException ("BROWSER CLOSED EXCEPTION");
		// Testing obj = new Testing ();The constructor Testing() is not visible--have
		// private constructor

	}

}
