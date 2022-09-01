package launchbrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();
		}
}
