package webdriverarch;

public class SafariDriver implements WebDriver {
	// constructor of SafariDriver to initialize it
	public SafariDriver() {
		System.out.println("Launch Safari Browser...");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("Finding Element: " + locator);
	}

	@Override
	public void click(String locator) {
		System.out.println("Click on: " + locator);
	}

	@Override
	public void sendkey(String locator, String value) {
		System.out.println("Enter value in: " + locator + " " + "value = " + value);

	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void get(String url) {
		System.out.println("enter url: " + url);
	}

	@Override
	public void close() {
		System.out.println("Close The Browser... ");

	}

}
