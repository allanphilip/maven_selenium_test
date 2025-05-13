package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productcartpage {

	WebDriver driver;
	@FindBy(xpath = "//input[@type='text']")
	WebElement prod1;

	@FindBy(xpath = "//h2[contains(@aria-label ,'JBL Flip 6 Wireless Portable Bluetooth Speaker Pro Sound, Upto 12 Hours Playtime, IP67 Water & Dustproof, PartyBoost & Personalization App (Without Mic, Black)')]")
	WebElement prodselect;

	@FindBy(xpath = "//input[contains(@id,'add-to-cart')]")
	WebElement addcart;

	@FindBy(xpath = "//div[@id='attach-added-to-cart-message']/descendant::input")
	WebElement cart2;

	public void searchprod() {
		prod1.sendKeys("jbl flip 6");
		prod1.sendKeys(Keys.ENTER);
	}

	public void selectprod() {
		prodselect.click();
	}

	public void cartbutton() {
		addcart.click();
	}

	public void cartselect() {
		cart2.click();
	}

	public Productcartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
