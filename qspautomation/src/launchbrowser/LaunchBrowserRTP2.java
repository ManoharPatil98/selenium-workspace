package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Browser i.e chrome or firefox : ");
		String browserName = sc.nextLine();

		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.quit();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.quit();
		}
		else
		{
			System.out.println("Type valid browser name");
		}
		sc.close();
	}

}
