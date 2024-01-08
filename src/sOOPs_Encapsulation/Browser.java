package sOOPs_Encapsulation;

//keeping everything public we are giving user unnecessary access to internal hardware
//why giving unnecessary access to internal methods to user it can be manipulated by user and there is risk of security
public class Browser {
	public void launchBrowser() {
		System.out.println("launching browser");
		checkRAM();
		checkCPUUtilization();
		checkBrowserVersion();
		checkBrowserUpgrade();
		System.out.println("Browser is launched...");
	}

	private void checkRAM() {
		System.out.println("check RAM");
	}

	private void checkCPUUtilization() {
		System.out.println("check CPU Utilization");
	}

	private void checkBrowserVersion() {
		System.out.println("check Browser Version");
	}

	private void checkBrowserUpgrade() {
		System.out.println("check Browser Upgrade");
	}

}
