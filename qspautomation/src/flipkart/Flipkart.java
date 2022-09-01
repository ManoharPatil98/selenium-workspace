package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement cross = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cross.click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='_3704LK' and @name='q']"));
		searchBox.sendKeys("iphone",Keys.ENTER);
		





	}

}
