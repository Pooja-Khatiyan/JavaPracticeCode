package javatopics;

//WAF:to launch the browser with if else
// function name-launchBrowser:chrome/ff/safari/edge
// parameter--browserName(String)
// return:boolean
public class Browser {
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);
		boolean flag = true;
		if (browserName.equals("chrome")) {
			System.out.println("chrome is launched");
		} else if (browserName.equals("firefox")) {
			System.out.println("firefox is launched");
		} else if (browserName.equals("edge")) {
			System.out.println("edge is launched");
		} else if (browserName.equals("opera")) {
			System.out.println("opera is launched");
		} else if (browserName.equals("safari")) {
			System.out.println("safari is launched");
		} else {
			System.out.println("please pass the write browser name: " + browserName);
			flag = false;
		}
		return flag;

	}

	public static void main(String[] args) {
		Browser br = new Browser();
		boolean flag = br.launchBrowser("opera");
		if (flag) {
			System.out.println("enter url");
		} else {
			System.out.println("error--no browser is there");
		}

	}

}
