package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cartpage {

	WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	WebElement newprod;

	@FindBy(xpath = "//h2[contains(@aria-label, 'GM-2100BB-1ADR')]")
	WebElement newprodselect;

	@FindBy(xpath = "//input[@value='Add to Cart']")
	WebElement addcart1;

	@FindBy(xpath = "//div[@id='attach-popover-lgtbox']")
	WebElement skipadd;

	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	WebElement carticon1;

	@FindBy(xpath = "(//button[@class='a-declarative'])[1]")
	WebElement removeprod;

	public void Searchnewprod() {
		newprod.sendKeys("casio gbd 200");
		newprod.sendKeys(Keys.ENTER);
	}

	public void Selectnewprod() {
		newprodselect.click();
	}

	public void Newcartadd() {
		addcart1.click();
	}

	public void skipbutton() {
		skipadd.click();
	}

	public void maincarticon() {
		carticon1.click();
	}

	public void removeprodbutton() {
		removeprod.click();
	}

	public Add_To_Cartpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
