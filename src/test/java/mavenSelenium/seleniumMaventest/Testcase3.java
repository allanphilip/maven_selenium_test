//Ensure login fail with incorrect mob no or password
package mavenSelenium.seleniumMaventest;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase3  extends BaseClass {
	
	
	@Test (priority = 1)
	public void Logindata() throws EncryptedDocumentException, IOException
	{
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		SoftAssert s1 = new SoftAssert();
		page.acclist(driver);
		page.signinbtn();
		lpage1.wronglogindetails();
		lpage1.problem();
		
		s1.assertEquals(lpage1.wrongcred.getText(),"There was a problem",null);

		s1.assertAll();
	}
		
		
		
	}


