package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		 System.setProperty("Webdriver.chrome.driver","C:\\Users\\Divi keerthi\\eclipse workspace\\Project\\lib\\chromedriver.exe");
		     int i=a;
		    System.out.println(a);
		 
		 WebElement user = driver.findElement(By.id("email"));
	        user.sendKeys("raj@gmail.com");
	     WebElement pswd = driver.findElement(By.id("pass"));
	        pswd.sendKeys("234567");
         WebElement btn = driver.findElement(By.id("loginbutton"));
           btn.click();
	}

}