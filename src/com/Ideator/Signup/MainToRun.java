package com.Ideator.Signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.HomePage.main.Signin;

public class MainToRun {
	private static WebDriver driver = null;

	
	@BeforeClass
 public void HomePageSearcchTestEnter() throws InterruptedException
	  {
		  driver = new FirefoxDriver();
		  driver.get("https://www.thegongzuo.com/");
		  //driver.manage().window().maximize();
	  }
	  
//	@Test 
//  public void signUp(){
//		Ideator.SignUp(driver).click();
//		
//  }
	@Test
	public void ClickonIdeator() throws InterruptedException{
	//Signin.SignInIdeator(driver).click();
	Registration.SignUpIdeator(driver).click();
	WebElement we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.id("txtFirstName")));
	Registration.idFirstName(driver).sendKeys("vv");
	Registration.idLastName(driver).sendKeys("v");
	Registration.idEmail(driver).sendKeys("v1@gmail.com");
	Registration.idPassword(driver).sendKeys("qwerty1!");
	Registration.idConfPassword(driver).sendKeys("qwerty1!");
	String w=Registration.idCaptcha(driver);
	String num[]=w.split("");
	  int ans=0;
	 
	  switch(num[10])
	  {
	  case "+":
		  ans=Integer.parseInt(num[9])+Integer.parseInt(num[11]);
		  break;
	  case "-":
		  ans=Integer.parseInt(num[9])-Integer.parseInt(num[11]);
		  break;
		  
	  
	  }
	  Registration.idCapValidate(driver).sendKeys(""+ans);
	  Registration.idTerms(driver).click();
	  we = (new WebDriverWait(driver,10)).
			  until(ExpectedConditions.presenceOfElementLocated(By.id("btnSignUp")));
	  
	  Registration.idSignup(driver).click();
	  Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='form1']/div[5]/div/div/h2[1]")).getText(), "Thank you for sign up!");

	//Registration.SignUpBussiness(driver).click();
	
		
		
	}
}
