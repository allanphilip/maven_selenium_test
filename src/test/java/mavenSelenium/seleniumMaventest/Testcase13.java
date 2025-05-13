//Check if user able to apply for coupon code
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class Testcase13 extends BaseClass {
	
	public void Couponcode() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productcartpage cartp = new Productcartpage(driver);
		Checkoutpage checkout = new Checkoutpage(driver);
		Couponpage coupon = new Couponpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		page.acclist(driver);
		page.signinbtn();
		lpage1.Logindetials();
		cartp.searchprod();
		cartp.selectprod();

		Set<String> win = driver.getWindowHandles();
		Iterator<String> id = win.iterator();
		String parentid = id.next();
		String childid = id.next();

		driver.switchTo().window(childid);

		checkout.Buynowbutton();
		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(driver.getTitle(), "Place Your Order - Amazon Checkout", null);
		
		coupon.couponcode();
		coupon.applybutton();
		
		s1.assertEquals(coupon.alert().getText(),"The promotional code you entered is not valid.");
		Thread.sleep(500);
		
		s1.assertAll();
	}


}
