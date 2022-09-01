package methodsofwebdriverinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://placements.qspiders.com/");
		String titleOfTheWebPage = driver.getTitle();  // returns title of current webpage in string format
		System.out.println(titleOfTheWebPage);
	}

}
