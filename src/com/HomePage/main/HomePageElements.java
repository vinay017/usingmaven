package com.HomePage.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageElements {
	
	private static WebElement element = null;
	
  @Test
  public static WebElement KeyWordSearch(WebDriver driver){
	element = driver.findElement(By.className("s-text"));
	  return element;
  }
 
  public static WebElement SearchIcon(WebDriver driver)
  {
	  element = driver.findElement(By.className("search-but"));
	  return  element;
  }
  public static WebElement EmailLogin(WebDriver driver){
	  
	  element = driver.findElement(By.xpath("//div/div/div[1]/div/div[1]/input[1]"));
	  return element;
  }
 
 public static WebElement PwdLogin(WebDriver driver){
	  
	  element = driver.findElement(By.xpath("//div/div/div[1]/div/div[1]/input[2]"));
	  return element;
  }
 
 public static WebElement ClickLogin(WebDriver driver){
	  
	  element = driver.findElement(By.xpath("//div/div/div[1]/div/div[1]/div[5]/input[1]"));
	  return element;
 }
 
 public static WebElement LoogOut(WebDriver driver){
	  
	  element = driver.findElement(By.xpath("//div[3]/div/div[1]/div[3]/a"));
	  return element;
}
 
 
}
