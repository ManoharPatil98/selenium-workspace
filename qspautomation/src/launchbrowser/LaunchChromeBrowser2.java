package launchbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser2 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		new ChromeDriver();
	}

}
