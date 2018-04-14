package com.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		//switch to the alert message
		Alert alert =driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println("Alert Text: " + alert.getText());
		alert.accept();
		
		//switch back to the main page
		driver.switchTo().defaultContent();
		
		
		System.out.println("Go button: " + driver.findElement(By.name("proceed")).getAttribute("value"));
		
	
		Thread.sleep(3000);
		driver.quit();
	}

}
