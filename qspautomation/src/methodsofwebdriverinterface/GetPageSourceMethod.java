package methodsofwebdriverinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///Q:/wcsa2workspace/HTML/multiselectdropdown.html");
		String sourceCodehtml= driver.getPageSource();  //it returns HTML source code of current webpage
		System.out.println(sourceCodehtml);
	}

}