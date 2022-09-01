package keyworddrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		flib.readPropertyData("./data/config.properties","browser");
		
	}
}
