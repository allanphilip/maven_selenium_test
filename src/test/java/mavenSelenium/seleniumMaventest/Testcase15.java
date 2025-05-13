//Verify till cart page without login in amazon application
package mavenSelenium.seleniumMaventest;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase15 extends BaseClass {
	@Test
	public void Direct_cartpage() throws InterruptedException
	{
		Productcartpage cartp = new Productcartpage(driver);
		
		Reach_cartpage reachcart = new Reach_cartpage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		cartp.searchprod();
		cartp.selectprod();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> id = win.iterator();
		String parentid = id.next();
		String childid = id.next();

		driver.switchTo().window(childid);
		cartp.cartbutton();
		cartp.cartselect();
		reachcart.Checkoutbutton();
		
		 SoftAssert s1 = new SoftAssert();
			s1.assertEquals(driver.getTitle(),"Place Your Order - Amazon Checkout");
			Thread.sleep(500);
			
			s1.assertAll();
	}

}
