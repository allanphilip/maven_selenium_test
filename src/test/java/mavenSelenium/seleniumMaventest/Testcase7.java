//Ensure the product detail page display all necessary info
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase7 extends BaseClass {

	@Test
	public void product_detial() throws EncryptedDocumentException, IOException, InterruptedException {

		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productcartpage cartp = new Productcartpage(driver);
		ProductDetailsPage details = new ProductDetailsPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

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

		s1.assertEquals(details.price.getText(), "₹8,999");

		s1.assertEquals(details.discribe.getText(), "About this item");

		s1.assertEquals(details.review.getText(), "Top reviews from India");

		s1.assertAll();

	}

}
