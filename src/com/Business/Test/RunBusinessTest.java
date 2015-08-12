package com.Business.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Ideator.Signup.Registration;


public class RunBusinessTest {
	private static WebDriver driver = null;
  @BeforeClass
  public void HomePageSearcchTestEnter() throws InterruptedException
 	  {
 		  driver = new FirefoxDriver();
 		  driver.get("https://www.thegongzuo.com/");
 		  //driver.manage().window().maximize();
 	  }
  
  @Test
	public void ClickonIdeator() throws InterruptedException{
		
	//Registration.SignUpIdeator(driver).click();

	Registration.SignUpBussiness(driver).click();
	Thread.sleep(2000);

	LoginInfo.FirstName(driver).sendKeys("Ramandeep");
	Thread.sleep(200);
	LoginInfo.LastName(driver).sendKeys("Singh");
	Thread.sleep(200);
	LoginInfo.BusinessName(driver).sendKeys("The Hacking Area");
	Thread.sleep(200);
	LoginInfo.BusinessEmail(driver).sendKeys("test1@domain.com");
	Thread.sleep(200);
	LoginInfo.Pwd(driver).sendKeys("HelloSingh123!");
	Thread.sleep(200);
	LoginInfo.UserID(driver).sendKeys("romy21romy@ooo.com");
	Thread.sleep(200);
	LoginInfo.PhoneNo(driver).sendKeys("1233323234");
	Thread.sleep(200);
	LoginInfo.Ext(driver).sendKeys("22");
	Thread.sleep(200);
	LoginInfo.Address(driver).sendKeys("This is Myst");
	Thread.sleep(200);
	LoginInfo.State(driver).sendKeys("TEsssstttt");
	
	
	
	
	
	
	
	Thread.sleep(500);
// 	LoginInfo.City(driver).sendKeys("California");
//	Thread.sleep(500);
//	LoginInfo.ZipCode(driver).sendKeys("1121");
//	Thread.sleep(500);
	
//	Select dropdown = new Select(driver.findElement(By.id("txtState_popup")));
//	dropdown.selectByIndex(1);
//	System.out.println(dropdown);
//	
	
		//LoginInfo.ChkBox(driver).click();
}
}