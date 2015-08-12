package com.Ideator.Signup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Registration{
	
		
private static WebElement element = null;
		
  public static WebElement SignUpIdeator(WebDriver driver)
  {
		WebElement elementToShowMenu = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/a"));
		new Actions(driver).moveToElement(elementToShowMenu).build().perform();
		element = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/ul/li[1]/a"));
		return element;
  }
  		public static WebElement SignUpBussiness(WebDriver driver){WebElement elementToShowMenu = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/a"));
		new Actions(driver).moveToElement(elementToShowMenu).build().perform();
		element = driver.findElement(By.xpath("html/body/form/div[3]/div/div[1]/div[2]/ul/li[2]/ul/li[2]/a"));
		return element;
  }
  		public static WebElement idFirstName(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("txtFirstName"));
		return firstName;
  }
  		public static WebElement idLastName(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("txtLastName"));
		return firstName;
  }
  		public static WebElement idEmail(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("txtEmail"));
		return firstName;
  }
  		public static WebElement idPassword(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("txtPassword"));
		return firstName;
  }
  		public static WebElement idConfPassword(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("txtConfirmPassword"));
		return firstName;
  }
  		public static String idCaptcha(WebDriver driver){
  			String firstName = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_lblCaptcha']")).getText();
		return firstName;
  }
  		public static WebElement idCapValidate(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("txtCaptchaValidate"));
		return firstName;
  }
  		public static WebElement idTerms(WebDriver driver){
  			WebElement firstName = driver.findElement(By.xpath(".//*[@id='chkAcceptTerms']/div[1]/div"));
		return firstName;
  }
  		public static WebElement idSignup(WebDriver driver){
  			WebElement firstName = driver.findElement(By.id("btnSignUp"));
		return firstName;
  }
  	
  		
  		
}
