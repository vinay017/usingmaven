package com.HomePage.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CandidateDashboardItems {

	/**
	 * @param args
	 */
	public static WebElement grabLastest(WebDriver driver){
			WebElement firstName = driver.findElement(By.id("btnGetMatchingJob"));
	return firstName;
}
	
	public static WebElement coverMore(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='statusbarMyCoverLetters']/div/a"));
return firstName;
}
	public static WebElement resumeMore(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='statusbarMyResumes']/div/a"));
return firstName;
}
	public static WebElement preferedMore(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='statusbarMyPrefferedJob']/div/a"));
return firstName;
}
	public static WebElement recentlyAppliedMore(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='statusbarMyAppliedJobs']/div/a"));
return firstName;
}
	public static WebElement searchAlertMore(WebDriver driver){
		WebElement firstName = driver.findElement(By.xpath(".//*[@id='statusbarMyJobAlerts']/div/a"));
return firstName;
}
	public static WebElement logout(WebDriver driver){
		WebElement firstName = driver.findElement(By.id("ucWelcome_lblLogout"));
return firstName;
}
	
}
