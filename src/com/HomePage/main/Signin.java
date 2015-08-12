package com.HomePage.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


	
		

public class Signin {

	/**
	 * @param args
	 */
	private static WebElement element = null;
	
	  public static WebElement SignInIdeator(WebDriver driver)
	  {
			WebElement elementToShowMenu = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[1]/a"));
			new Actions(driver).moveToElement(elementToShowMenu).build().perform();
			element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[1]/ul/li[1]/a"));
			return element;
	  }
	  		public static WebElement SignInBussiness(WebDriver driver){WebElement elementToShowMenu = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[1]/a"));
			new Actions(driver).moveToElement(elementToShowMenu).build().perform();
			element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[1]/ul/li[2]/a"));
			return element;
	  }
	  		public static WebElement signInEmail(WebDriver driver){
	  			WebElement firstName = driver.findElement(By.id("ContentPlaceHolder1_txtUserId"));
			return firstName;
	  }
	  		public static WebElement signInPassword(WebDriver driver){
	  			WebElement firstName = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
			return firstName;
	  }
	  		public static WebElement signInLoginButton(WebDriver driver){
	  			WebElement firstName = driver.findElement(By.id("ContentPlaceHolder1_btnlogin"));
			return firstName;
	  }
	  		
	  		
	  		
}
