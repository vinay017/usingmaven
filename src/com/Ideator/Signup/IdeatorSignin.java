package com.Ideator.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.HomePage.main.*;

public class IdeatorSignin {
	private static WebDriver driver = null;
	@BeforeClass
	 public void HomePageSearcchTestEnter() throws InterruptedException
		  {
			  driver = new FirefoxDriver();
			  driver.get("https://www.thegongzuo.com/");
			  //driver.manage().window().maximize();
		  }
  @Test(priority=1)
  public void signin() {
	  Signin.SignInIdeator(driver).click();
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.id("ContentPlaceHolder1_txtUserId")));
	  Signin.signInEmail(driver).sendKeys("vinay@nextgentechinc.com");
	  Signin.signInPassword(driver).sendKeys("qwerty1!");
	  Signin.signInLoginButton(driver).click();
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[2]/div/div[1]/h3")).getText(), "You are logged in as Candidate");
	  
	  
  }
  @Test(priority=2)
  public void dashBoardLatest()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	
	  CandidateDashboardItems.grabLastest(driver).click();
	  we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='gvGrabLatestOpportunity']/div[1]/h3")));
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='gvGrabLatestOpportunity']/div[1]/h3")).getText(), "Grab Latest Opportunity");
	  driver.navigate().back();
  }
  @Test(priority=3)
  public void dashBoardCover()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	 
	 
	  CandidateDashboardItems.coverMore(driver).click();
	   we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")));
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")).getText(), "COVER LETTER");
	  driver.navigate().back();
  }
  @Test(priority=4)
  public void dashBoardResume()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	
	  CandidateDashboardItems.resumeMore(driver).click();
	   we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")));
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")).getText(), "MANAGE RESUME");
	  driver.navigate().back();
  }
  @Test(priority=5)
  public void dashBoardPrefered()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	
	  CandidateDashboardItems.preferedMore(driver).click();
	 we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")));
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")).getText(), "PREFERRED JOBS");
	  driver.navigate().back();
  }
  @Test(priority=6)
  public void dashBoardRecentlyApplied()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	
	  CandidateDashboardItems.recentlyAppliedMore(driver).click();
	   we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")));
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")).getText(), "APPLIED JOBS");
	  driver.navigate().back();
  }
  @Test(priority=7)
  public void dashBoardSearchAlerts()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	
	  CandidateDashboardItems.searchAlertMore(driver).click();
	  we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")));
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")).getText(), "MANAGE ALERT");
	  driver.navigate().back();
  }
  @Test(priority=8)
  public void dashBoardLogout()
  {
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
	
	  CandidateDashboardItems.logout(driver).click();
	  
  }


}
