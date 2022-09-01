package RTP;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		Scanner sc = new Scanner(System.in); // ctrl+1 for getting classname or return type
		System.out.println("Enter the browser name , chrome or firefox");
		String browserValue = sc.nextLine();
		// browserValue variable contains name of browser which is supposed to be opened

		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.close();
		}

		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			driver.close();
		}

		else
		{
			System.out.println("Enter valid input");
		}
		sc.close();   // if we dont close it displays warning like Resource leak- sc never closed.
	}
}
