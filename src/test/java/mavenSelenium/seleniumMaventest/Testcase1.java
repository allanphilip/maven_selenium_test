package mavenSelenium.seleniumMaventest;

import org.testng.annotations.Test;


public class Testcase1 extends BaseClass
{

	
	@Test
	public void validcredintials()
	{
		
		Homepage page = new Homepage(driver);
		page.acclist(driver);
		page.signinbtn();
	}
	
}
