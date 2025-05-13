//verify the product can be added to shopping cart from product pages
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase9 extends BaseClass {

	@Test
	public void cartbutton() throws EncryptedDocumentException, IOException, InterruptedException {
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productcartpage cartp = new Productcartpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

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

		cartp.cartbutton();
		cartp.cartselect();

		SoftAssert s1 = new SoftAssert();
		s1.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart", null);
		Thread.sleep(500);

		s1.assertAll();

	}

}
