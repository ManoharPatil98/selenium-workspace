package xpathlocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way3_Syntax1
{
	static
	{
		System.setProperty("webdrivers.driver.chrome","./drivers/chromedriver.exe");

	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();	
	}

}