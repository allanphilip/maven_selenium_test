package mavenSelenium.seleniumMaventest;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Productpage {

	WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	WebElement searchprod;

	@FindBy(xpath = "//div[@role='listitem']")
	List<WebElement> productList;

	public void prod() {
		searchprod.sendKeys("phones");
		searchprod.sendKeys(Keys.ENTER);

	}

	public List<WebElement> GetProductList() {
		return productList;
	}

	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
