package mavenSelenium.seleniumMaventest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filterpage {

	WebDriver Driver;

	@FindBy(xpath = "//span[.='Apple']")
	WebElement brandid;

	@FindBy(xpath = "//span[.='Apple']")
	WebElement storageid;

	@FindBy(xpath = "//div[contains(@class,'desktop-content')]")
	List<WebElement> producttitle;

	public void brand() {
		brandid.click();
	}

	public void storage() {
		storageid.click();
	}

	public List<WebElement> GetProducttitle() {
		return producttitle;
	}

	public Filterpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
