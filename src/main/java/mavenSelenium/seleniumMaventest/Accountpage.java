package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountpage {

WebDriver driver;	

@FindBy(xpath="//span[@class='nav-line-2 ']")
WebElement profile;

@FindBy(xpath="//span[.='Your Account']")
WebElement youraccount;

@FindBy(xpath="(//a[@class='a-link-normal ya-card__whole-card-link'])[2]")
WebElement security;

@FindBy(xpath="(//span[@class='a-button-inner'])[1]")
WebElement nameedit;

@FindBy(xpath="(//input[@type='text'])[2]")
WebElement newname;

@FindBy(xpath="(//input[@type='submit'])[2]")
WebElement submit;

public void AccountHome(WebDriver driver)
{
	Actions action= new Actions(driver);
	action.moveToElement(profile).perform();
	
	youraccount.click();
	
}

public void Loginsecurity()
{
	security.click();
	nameedit.click();
	newname.sendKeys("philip");
	submit.click();
}

public Accountpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


	
}
