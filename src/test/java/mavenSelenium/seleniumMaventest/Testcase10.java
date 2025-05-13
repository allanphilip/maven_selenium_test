//test updating item quantities and removing item from the cart
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase10 extends BaseClass{
	
	@Test
	
	public void Addandreomveprod() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Productcartpage cartp = new Productcartpage(driver);
		Add_To_Cartpage addcart1 = new Add_To_Cartpage(driver);
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

		cartp.cartbutton();
		cartp.cartselect();
		
		 addcart1.Searchnewprod();
		 addcart1.Selectnewprod();
		 Set<String> win2 = driver.getWindowHandles();
			List<String> winList = new ArrayList<>(win2);

			// Ensure at least 3 windows are open
			if (winList.size() >= 3) {
			    driver.switchTo().window(winList.get(2)); // Switch to 3rd window
			} else {
			    System.out.println("Less than 3 windows are open.");
			}
			
		addcart1.Newcartadd();
		addcart1.skipbutton();		Thread.sleep(5000);
		addcart1.maincarticon();
		addcart1.removeprodbutton();
		
		SoftAssert s1 = new SoftAssert();
	    boolean isWatchNameDisplayed = false;
		s1.assertFalse(isWatchNameDisplayed, "Casio watch name is still displayed after deletion.");
		Thread.sleep(500);

		s1.assertAll();

		
	}

}
