package mavenSelenium.seleniumMaventest;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	@FindBy(xpath="//input[@type ='email']") 
	WebElement emailid;
	
	
	
	@FindBy(xpath="//input[@type ='password']")
	WebElement password;
	
	@FindBy(xpath="//h4[.='There was a problem']")
	WebElement wrongcred;
	
	@FindBy(xpath="(//div[@class='a-alert-content'])[1]")
	WebElement verify;
	
	
	
	
	
	public void Logindetials() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("D:\\selnium 2\\selenium driver\\Testselenium\\Excelsheet\\allan.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1  = w1.getSheet("login1");
		//reading username
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
	    BigDecimal bd = new BigDecimal(c1.getNumericCellValue());
	    String un = bd.toPlainString();
		System.out.println(un);
		//reading pasword
		String pwd = w1.getSheet("login1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
		emailid.sendKeys(un);
		emailid.sendKeys(Keys.ENTER);
		password.sendKeys(pwd);
		password.sendKeys(Keys.ENTER);
	}
	
	public void wronglogindetails() throws EncryptedDocumentException, IOException
	{
		FileInputStream f2 = new FileInputStream("D:\\selnium 2\\selenium driver\\Testselenium\\Excelsheet\\allan.xlsx");
		Workbook w2 = WorkbookFactory.create(f2);
		Sheet s2  = w2.getSheet("login2");
		//reading username
		Row r2 = s2.getRow(1);
		Cell c2 = r2.getCell(0);
	    BigDecimal bd1 = new BigDecimal(c2.getNumericCellValue());
	    String un = bd1.toPlainString();
		System.out.println(un);
		//reading pasword
		String pwd = w2.getSheet("login2").getRow(1).getCell(1).getStringCellValue();	
		System.out.println(pwd);
		emailid.sendKeys(un);
		emailid.sendKeys(Keys.ENTER);
		password.sendKeys(pwd);
		password.sendKeys(Keys.ENTER);
	}
	
	public WebElement problem()
	{
		return wrongcred;
	}
	
	public  WebElement veriftassert()
	{
		 return verify;
	}
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
