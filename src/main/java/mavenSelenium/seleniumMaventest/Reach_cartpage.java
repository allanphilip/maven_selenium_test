package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reach_cartpage {

	@FindBy(name="proceedToRetailCheckout")
	WebElement Checkout;
	
	public void Checkoutbutton()
	{
		Checkout.click();
	}
	
	public Reach_cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
