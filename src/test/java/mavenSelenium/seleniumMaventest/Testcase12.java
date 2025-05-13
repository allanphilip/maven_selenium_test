//check if the user able to select each payment method
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase12 extends BaseClass
{
@Test
	public void paymentmethod() throws EncryptedDocumentException, IOException
	{
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productcartpage cartp = new Productcartpage(driver);
		Checkoutpage checkout = new Checkoutpage(driver);
		Paymentmethodpage payment  = new  Paymentmethodpage(driver);
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

		SoftAssert s1 = new SoftAssert();
		
		checkout.Buynowbutton();
		
		s1.assertEquals(driver.getTitle(), "Place Your Order - Amazon Checkout", null);
		
		
		payment.credicard();
		s1.assertTrue(payment.cred.isDisplayed(), "Credit Card option is not displayed");
		s1.assertTrue(payment.cred.isEnabled(), "Credit Card option is not clickable");
		
		payment.netbankinapp();
		s1.assertTrue(payment.netb.isDisplayed(), "Net Banking option is not displayed");
		s1.assertTrue(payment.netb.isEnabled(), "Net Banking option is not clickable");
		
		payment.upibutton();
		s1.assertTrue(payment.upi.isDisplayed(), "UPI option is not displayed");
		s1.assertTrue(payment.upi.isEnabled(), "UPI option is not clickable");
		
		payment.emibutton();
		s1.assertTrue(payment.emi.isDisplayed(), "EMI option is not displayed");
		s1.assertTrue(payment.emi.isEnabled(), "EMI option is not clickable");
		
		
		payment.cashondel();
		s1.assertTrue(payment.cod.isDisplayed(), "Cash On Delivery option is not displayed");
		s1.assertTrue(payment.cod.isEnabled(), "Cash On Delivery option is not clickable");
		
		s1.assertAll();
	}
}
