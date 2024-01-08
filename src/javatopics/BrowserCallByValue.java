package javatopics;
//CALL BY VALUE -- call a specific method by passing the argument /value.
public class BrowserCallByValue {
	// WAF:to launch the browser
	// function name-launchBrowser:chrome/ff/safari/edge
	// parameter--browserName(String)
	// return:boolean
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser Name Is: " + browserName);
		boolean flag = true;
		switch (browserName.toLowerCase().trim()) {
		case "chrome": {
			System.out.println("Chrome Is Launched");
		}
			break;
		case "firefox": {
			System.out.println("Firefox Is Launched");
		}
			break;
		case "edge": {
			System.out.println("Edge Is Launched");
		}
			break;
		case "safari": {
			System.out.println("Safari Is Launched");
		}
			break;
		default:
			System.out.println("please pass the right browser name..." + " " + browserName);
			flag = false;
			break;
		}
		// return true;
		return flag;
	}

	public static void main(String[] args) {
		BrowserCallByValue br = new BrowserCallByValue();
//we are calling a function by passing a value--i.e call by value
//one parameter we are taking here and one argument we are passing here
//break means coming out of switch case if case is satisfied
		boolean flag = br.launchBrowser("pooja");
		if (flag) {
			System.out.println("enter url");
		} else {
			System.out.println("error---no browser is there");
		}

	}

}
