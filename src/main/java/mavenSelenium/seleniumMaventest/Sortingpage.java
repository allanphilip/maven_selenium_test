package mavenSelenium.seleniumMaventest;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sortingpage {
	
	WebDriver driver;
	
	@FindBy (xpath= "//input[@type='text']")
	WebElement prodnew;
	
	@FindBy (xpath = "//span[@class='a-button-text a-declarative']")
	WebElement sortid;
	
	@FindBy (xpath ="//div[@class='a-popover-inner']/ul/li")
	List<WebElement> listid;
	
	@FindBy (xpath ="//span[@class='a-price-whole']")
	List <WebElement> pricelist1;

	
	
	public void product1()
	{
		prodnew.sendKeys("iphone 16 pro max");
		prodnew.sendKeys(Keys.ENTER);
	}
	
	
	
	public void sort()
	{
		sortid.click();
	}
	
	public List<WebElement> Sortlist() 
	{
		return listid;

	}
	
	public List<WebElement> Pricelist()
	{
		return pricelist1;
	}
	
	public Sortingpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
