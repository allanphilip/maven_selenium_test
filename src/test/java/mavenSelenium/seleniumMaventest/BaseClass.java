package mavenSelenium.seleniumMaventest;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	 WebDriver driver;
	@BeforeMethod
	public void Launch() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void quit() throws IOException
	{
		
		
		driver.quit();
}
}


