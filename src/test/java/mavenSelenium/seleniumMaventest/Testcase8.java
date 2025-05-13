//check if the product can be sorted by relevance price price etc
package mavenSelenium.seleniumMaventest;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase8 extends BaseClass {

	@Test

	public void Sortingproduct() throws EncryptedDocumentException, IOException {
		Homepage page = new Homepage(driver);
		Loginpage lpage1 = new Loginpage(driver);
		Sortingpage sort1 = new Sortingpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		page.acclist(driver);
		page.signinbtn();
		lpage1.Logindetials();
		sort1.product1();
		sort1.sort();
		List<WebElement> listid = sort1.Sortlist();

		int count = listid.size();
		System.out.println(count);

		for (WebElement sel : listid) {
			String text = sel.getText();
			System.out.println(text);

			if (text.contains("Price: Low to High")) {
				sel.click();

			}
		}

		List<WebElement> pricelist1 = sort1.Pricelist();
		{
			List<Integer> prices = new ArrayList<>();
			for (int i = 0; i < 11; i++) {
				String priceText = pricelist1.get(i).getText().replaceAll("[^0-9]", "");
				if (!priceText.isEmpty()) {
					prices.add(Integer.parseInt(priceText));
				}
			}
			List<Integer> sortedPrices = new ArrayList<>(prices);
			Collections.sort(sortedPrices);
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(prices, sortedPrices, "Prices are not sorted in ascending order");
			softAssert.assertAll();
		}

	}

}
