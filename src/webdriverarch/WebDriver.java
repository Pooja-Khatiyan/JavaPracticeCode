package webdriverarch;

public interface WebDriver {
	public void findElement(String locator);
	public void click(String locator);
	public  void sendkey(String locator , String value);
	public String getTitle();
	public void get (String url);
	public void close();
	
}
