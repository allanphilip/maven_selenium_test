//check if user  can successfully edit their profile info
package mavenSelenium.seleniumMaventest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(Listernerstest.class)
public class Testcase4 extends BaseClass {

	@Test
	public void Profileedit() throws EncryptedDocumentException, IOException {
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		SoftAssert s1 = new SoftAssert();
		page.acclist(driver);
		page.signinbtn();
		lpage1.Logindetials();
//s1.assertEquals(driver.getTitle(),
				//"Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available.",
			//);
s1.assertTrue(true, driver.getTitle());

		Accountpage aphome = new Accountpage(driver);
		aphome.AccountHome(driver);
		Accountpage editname = new Accountpage(driver);
		editname.Loginsecurity();

		// WebElement verify =
		// driver.findElement(By.xpath("(//div[@class='a-alert-content'])[1]"));

		s1.assertEquals(lpage1.veriftassert().getText(), "Name updated.", null);

		s1.assertAll();

	}

}
