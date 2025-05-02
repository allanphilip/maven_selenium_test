package mavenSelenium.seleniumMaventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

WebDriver driver;	
@FindBy(xpath="//div[@class='nav-line-1-container']")
WebElement accountlist;

@FindBy(xpath="(//a[.='Start here.'])[1]")
WebElement signin;

public void acclist(WebDriver driver)
{
	Actions action= new Actions(driver);
	action.moveToElement(accountlist).perform();
}

public void signinbtn()
{
	signin.click();
}

public Homepage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
