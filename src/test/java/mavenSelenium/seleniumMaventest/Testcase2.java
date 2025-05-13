//login is successful with correct mobno and password 
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Listernerstest.class)
public class Testcase2 extends BaseClass
{

	
	@Test(priority = 1)
	public void validcredintials()
	{
		
		Homepage page = new Homepage(driver);
		
		
		page.acclist(driver);
		page.signinbtn();
	
	}
	
	@Test (priority = 2)
	public void Logindata() throws EncryptedDocumentException, IOException
	{
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SoftAssert s1 = new SoftAssert();
		page.acclist(driver);
		page.signinbtn();
		lpage1.Logindetials();
		
		s1.assertEquals(driver.getTitle(),
				"Amazon Sign In",
				null);

		s1.assertAll();
		
	}
	
		}
	
	
	
	

