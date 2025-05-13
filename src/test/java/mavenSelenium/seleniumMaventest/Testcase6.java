//Verify that searching with filters yield accurate result
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase6 extends BaseClass {

	@Test

	public void filtersearch() throws EncryptedDocumentException, IOException {
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productpage ppage1 = new Productpage(driver);

		Filterpage filter = new Filterpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		SoftAssert s1 = new SoftAssert();
		page.acclist(driver);
		page.signinbtn();
		lpage1.Logindetials();
		ppage1.prod();
		filter.brand();
		filter.storage();
		List<WebElement> producttitle = filter.GetProducttitle();

		for (WebElement product : producttitle) {
			String title = product.getText().toLowerCase();
			// System.out.println("Product Title: " + title);

			boolean more520gb = title.contains("512 gb") || title.contains("1 tb");

			// Soft assertion for each product title
			s1.assertTrue(more520gb, "Product doesn't match memory filter: " + title);
		}

		s1.assertAll();
	}//
}
