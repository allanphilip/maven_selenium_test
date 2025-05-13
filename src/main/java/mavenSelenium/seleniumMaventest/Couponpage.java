package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Couponpage {
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement coupon;
	
	@FindBy(xpath ="//input[@value='Apply']")
	WebElement apply;
	
	@FindBy(xpath ="//p[.='The promotional code you entered is not valid.']")
	WebElement alert;
	
	public void couponcode()
	{
		coupon.sendKeys("amazon 100");
	}
	public void applybutton()
	{
		apply.click();
	}
	
	public WebElement alert()
	{
		return alert;
	}
	
	public Couponpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
}
}
