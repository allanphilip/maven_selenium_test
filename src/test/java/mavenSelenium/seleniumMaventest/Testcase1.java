//Test if new user can successfully login
package mavenSelenium.seleniumMaventest;


import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 extends BaseClass {
@Test
	public void registration()
	{
	Registrationpage rpg1 = new Registrationpage(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	rpg1.hoverover(driver);
	rpg1.starthere();
	SoftAssert s1 = new SoftAssert();
	s1.assertTrue(rpg1.user.isDisplayed(),"Error box shown for empty email");
	rpg1.username();
	rpg1.submitbtn();
	s1.assertTrue(rpg1.createacc.isDisplayed(),"create account is displayed");
	rpg1.createaccount();
	rpg1.nametext();
	rpg1.password();
	s1.assertEquals(rpg1.pass.getDomAttribute("type"), "password");
	rpg1.password();
	rpg1.verifynumber();
s1.assertAll();
	
	}
}
