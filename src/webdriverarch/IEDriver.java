package webdriverarch;

public class IEDriver implements WebDriver {
	// constructor of IEDriver to initialize it
	public IEDriver() {
		System.out.println("Launch IE Browser...");
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
