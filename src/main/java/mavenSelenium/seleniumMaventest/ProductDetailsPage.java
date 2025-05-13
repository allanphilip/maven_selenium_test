package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	WebDriver driver;
	@FindBy(xpath = "(//span[.='₹8,999'])[1]")
	WebElement price;

	@FindBy(xpath = "//h2[.=' About this item ']")
	WebElement discribe;

	@FindBy(xpath = "//div[@id='cm-cr-local-reviews-title']/child::h3")
	WebElement review;

	public WebElement priceid() {
		return price;
	}

	public WebElement discribeid() {
		return discribe;
	}

	public WebElement reviewid() {
		return review;
	}

	public ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
