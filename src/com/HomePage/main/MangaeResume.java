package com.HomePage.main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MangaeResume {

	public static WebElement deleteResume(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='row2ManageResumeGrid']/div[13]/input"));
return firstName;
}
	
	public static WebElement deletePopupCancel(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='top']/div[51]/div[2]/a[1]"));
return firstName;
}
}
