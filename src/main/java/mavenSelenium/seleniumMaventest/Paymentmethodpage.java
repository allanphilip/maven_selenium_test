package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentmethodpage {

	WebDriver driver;
	@FindBy(xpath ="(//input[@type='radio'])[1]")
	WebElement cred;
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement netb;
	@FindBy(xpath = "(//input[@type='radio'])[3]")
	WebElement upi;
	@FindBy(xpath = "(//input[@type='radio'])[4]")
	WebElement emi;
	@FindBy(xpath="(//input[@type='radio'])[5]")
	WebElement cod;
	
	public void credicard()
	{
		cred.click();
	}
	public void netbankinapp()
	{
		netb.click();
	}
	public void upibutton()
	{
		upi.click();
	}
	public void emibutton()
	{
		emi.click();
	}
	public void cashondel()
	{
		cod.click();
	}
	
	public Paymentmethodpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
}
}