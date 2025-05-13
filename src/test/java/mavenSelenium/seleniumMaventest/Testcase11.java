//Validate entire checkout page 
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase11 extends BaseClass {

	@Test

	public void checkoutcart() throws EncryptedDocumentException, IOException, InterruptedException {
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productcartpage cartp = new Productcartpage(driver);
		Checkoutpage checkout = new Checkoutpage(driver);
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
		checkout.confirmaddress();
		checkout.paymentradiobutton();
		checkout.netbankingicon();
		List<WebElement> netbank = checkout.Getnetbank();
		for (WebElement bank : netbank) {
			String text = bank.getText();
			if (text.contains("ICICI Bank")) {
				bank.click();
			}

		}

		checkout.proceedtopaybutton();
		Thread.sleep(3000);
		checkout.Skipad();

		SoftAssert s3 = new SoftAssert();
		WebElement AddressElement = driver.findElement(By.xpath("//span[@id='deliver-to-address-text']"));
		String actualaddress = AddressElement.getText();
		s3.assertTrue(actualaddress.contains("655, darsan nagar, tvm"), "Address mismatch in order review.");

		SoftAssert s4 = new SoftAssert();
		WebElement paymentElement = driver.findElement(By.xpath("//span[.='Net Banking: ICICI Bank']"));
		String actualPayment = paymentElement.getText();
		s4.assertTrue(actualPayment.contains("ICICI Bank"), "Payment mismatch in order review.");

		SoftAssert s2 = new SoftAssert();
		WebElement productNameElement = driver
				.findElement(By.xpath("//span[contains(@id, 'checkout-item-block-item-primary-title')]"));
		String actualProductName = productNameElement.getText();
		s2.assertTrue(actualProductName.contains("JBL Flip 6"), "Product name mismatch in order review.");

		s1.assertAll();
		s2.assertAll();
		s3.assertAll();
		s4.assertAll();

	}
}
