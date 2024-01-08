package javatopics;

public class IfElseType {

	public static void main(String[] args) {
		// for string comparison we should use single = instead of double =
		// for string comparison we should use method .equals()
		String test = "VIHAN";
		if (test.equals("vihan"))// method is case sensitive
		{
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		System.out.println("---------------------------------------------------------");

		String browser = "firefox";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		if (browser.equals("safari")) {
			System.out.println("launch firefox");
		}
		if (browser.equals("edge")) {
			System.out.println("launch edge");// in this program else is associated with above if only
		}

		else {
			System.out.println("plz pass right browser: " + browser);
		}

		System.out.println("---------------------------------------------------------");
//to optimize above code
		String browser1 = "chrome";

		if (browser1.equals("chrome")) {
			System.out.println("launch chrome");
		} else if (browser1.equals("firefox")) {
			System.out.println("launch firefox");// performance issue
		} else if (browser1.equals("safari")) {// it is not optimized code even though logic is correct
			System.out.println("launch firefox");
		} else if (browser1.equals("edge")) {
			System.out.println("launch edge");
		}

		else {
			System.out.println("plz pass right browser: " + browser1);
		}

	}
}
