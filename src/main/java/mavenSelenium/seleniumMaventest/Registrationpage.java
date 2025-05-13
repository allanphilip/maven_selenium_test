package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='nav-line-1-container']")
	WebElement hov;
	
	@FindBy(xpath ="(//a[.='Start here.'])[1]" )
	WebElement start;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement user;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement continuee;
	
	@FindBy(xpath = "//input[@id='createAccount']")
	WebElement createacc;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement name;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement verify;
	
	public void hoverover(WebDriver driver)
	{
		Actions action= new Actions(driver);
		action.moveToElement(hov).perform();
	}
	
	public void starthere()
	{
		start.click();
	}
	public void username()
	{
		user.sendKeys("9995470010");
	}
	public void submitbtn()
	{
		continuee.click();
	}
	
	public void createaccount()
	{
		createacc.click();
	}
	public void nametext()
	{
		name.sendKeys("marki");
	}
	public void password()
	{
		pass.sendKeys("test12345");
	}
	public void verifynumber()
	{
		verify.click();
	}
	
	public Registrationpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
}
