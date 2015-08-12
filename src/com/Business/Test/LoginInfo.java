package com.Business.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginInfo {
 
	private static WebElement element = null;
	
	  public static WebElement FirstName(WebDriver driver)
	  {
			element = driver.findElement(By.id("TxtFirstName"));
			return element;
	  }
	  
	  public static WebElement LastName(WebDriver driver)
	  {
			element = driver.findElement(By.id("TxtLastName"));
			return element;
	  }
	  public static WebElement BusinessName(WebDriver driver)
	  {
			element = driver.findElement(By.id("txtCompanyName"));
			return element;
	  }
	  public static WebElement BusinessEmail(WebDriver driver)
	  {
		  element = driver.findElement(By.id("TxtEmail"));
		  return element;
		  
	  }
	  public static WebElement UserID(WebDriver driver)
	  {
		  element = driver.findElement(By.id("txtUsername1"));
		  return element;
	  }
	  public static WebElement Pwd(WebDriver driver)
	  {
		  element = driver.findElement(By.id("pwdUser1"));
		  return element;
	  }
	  public static WebElement PhoneNo(WebDriver driver)
	  {
		  element = driver.findElement(By.id("TxtMainPhone"));
		  return element;
	  }
	  public static WebElement Ext(WebDriver driver)
	  {
		  element = driver.findElement(By.id("txtExt"));
		  return element;
	  }
	  public static WebElement Address(WebDriver driver)
	  {
		  element = driver.findElement(By.id("TxtAddress"));
		  return element;
	  }
	  public static WebElement State(WebDriver driver)
	  {
		  element = driver.findElement(By.id("txtState"));
		  return element;
	  }
	  public static WebElement City(WebDriver driver)
	  {
		  element = driver.findElement(By.id("txtCity"));
		  return element;
	  }
	  public static WebElement ZipCode(WebDriver driver)
	  {
		  element = driver.findElement(By.id("txtZipCode"));
		  return element;
	  }
	  public static WebElement ChkBox(WebDriver driver)
	  {
		  element = driver.findElement(By.id("chkAcceptTerms"));
		  return element;
	  }
	  
	 
	 
}