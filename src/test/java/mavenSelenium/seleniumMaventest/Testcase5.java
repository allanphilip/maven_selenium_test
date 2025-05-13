//Test searching for product using its name like phone
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase5 extends BaseClass {

	@Test
	public void productSearch() throws EncryptedDocumentException, IOException {

		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productpage ppage1 = new Productpage(driver);
		Productpage prolist = new Productpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		SoftAssert s1 = new SoftAssert();
		page.acclist(driver);
		page.signinbtn();
		lpage1.Logindetials();
		ppage1.prod();
		List<WebElement> productList = prolist.GetProductList();

		s1.assertTrue(productList.size() > 0);

		s1.assertAll();

	}

}
