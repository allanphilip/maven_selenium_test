package mavenSelenium.seleniumMaventest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	WebDriver driver;
	
	@FindBy(xpath ="//input[@title='Buy Now']")
	WebElement buynow;
	
	@FindBy(xpath = "//span[@id='checkout-primary-continue-button-id-announce']")
	WebElement cnfadd;
	
	@FindBy(xpath = "//div[@class='a-radio a-spacing-top-mini']/child::label/child::input")
	WebElement pay;
	
	@FindBy(xpath ="(//span[@class='a-dropdown-prompt'])[1]" )
	WebElement netbankicon;
	
	@FindBy(xpath = "//div[@class='a-popover-inner a-lgtbox-vertical-scroll']/ul/li")
	List<WebElement> netbank;
	
	@FindBy(xpath ="//span[@id='checkout-primary-continue-button-id']")
	WebElement proceedpay;
	
	@FindBy(xpath = "//span[@class='a-prime-button a-button']/child::span")
	WebElement skip;
	
	public void Buynowbutton()
	{
		buynow.click();
	}
	public void confirmaddress()
	{
		cnfadd.click();
	}
	public void paymentradiobutton()
	{
		pay.click();
	}
	public void netbankingicon()
	{
		netbankicon.click();
	}
	
	public List<WebElement> Getnetbank() {
		return netbank;
	}
	
	public void proceedtopaybutton()
	{
		proceedpay.click();
	}
	
	public void Skipad()
	{
		skip.click();
	}

	public Checkoutpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

}
