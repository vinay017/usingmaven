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

import com.HomePage.main.CandidateDashboardItems;
import com.HomePage.main.MangaeResume;
import com.HomePage.main.Signin;

public class ResumeManage {
	public static WebDriver driver=null;
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
	  public void dashBoardResume()
	  {
		  WebElement we = (new WebDriverWait(driver,10)).
				  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a")));
		
		  CandidateDashboardItems.resumeMore(driver).click();
		   we = (new WebDriverWait(driver,10)).
				  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")));
		  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div[2]/div[1]/div[1]/h2")).getText(), "MANAGE RESUME");
		  
	  }

  @Test
  public void mangeResumeCancel() throws InterruptedException {
	  Thread.sleep(5000);
	  WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='row2ManageResumeGrid']/div[13]/input")));
	
	  MangaeResume.deleteResume(driver).click();
	  we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='top']/div[51]/div[2]/a[1]")));
	  MangaeResume.deletePopupCancel(driver).click();
	  
	  
  }
}
