package com.HomePage.main;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Main {
 
	private static WebDriver driver = null;
	String URL;
	
	  @Test(priority = 1)
 public void HomePageSearcchTestEnter() throws InterruptedException
	  {
		  driver = new FirefoxDriver();
		  driver.get("https://www.thegongzuo.com/");
		  driver.manage().window().maximize();
		  

	  
		  HomePageElements.KeyWordSearch(driver).sendKeys("Hello");
		  HomePageElements.KeyWordSearch(driver).sendKeys(Keys.RETURN);
		 URL = driver.getCurrentUrl();
		System.out.println(" When User Press Enter after entering values\nin keyword search text box Reloads the homepage.\nit should take user to the login page \033[0m\n");
		Assert.assertEquals(URL, "https://www.thegongzuo.com/Login.aspx?ReturnUrl=%2fIdeaResultList.aspx" );
	
	  }
		  @Test (priority = 2)
		public void HomePageSearchTestICON() throws InterruptedException
		  {
			
		  HomePageElements.KeyWordSearch(driver).sendKeys("Hello");
		  HomePageElements.SearchIcon(driver).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "https://www.thegongzuo.com/Login.aspx?ReturnUrl=%2fIdeaResultList.aspx" );
		  System.out.println("URL matching --> Part executed");
		  
	  }
		  @Test (priority = 3)
		  public void Login(){
			  HomePageElements.EmailLogin(driver).sendKeys("romy21romy@hotmail.com");
			  HomePageElements.PwdLogin(driver).sendKeys("HelloSingh123!");
			  HomePageElements.ClickLogin(driver).click();
			  URL = driver.getCurrentUrl();
			  Assert.assertEquals(URL, "https://www.thegongzuo.com/IdeaResultList.aspx");
			  
			  
		  }
		  
		  @Test (priority = 4)
		  public void LogOut() throws InterruptedException{
			  Thread.sleep(4000);
			  HomePageElements.LoogOut(driver).click();
		  }
		  
		  

}
