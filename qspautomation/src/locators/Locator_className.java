package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_className
{
	static
	{
		System.setProperty("webdriver.driver.chrome", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("flipkart",Keys.ENTER);
		driver.findElement(By.className(""));
		//driver.findElement(By.ByClassName);
	}

}
