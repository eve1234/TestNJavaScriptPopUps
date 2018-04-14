package com.test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPromptBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		driver.findElement(By.id("prompt")).click();
		
		//switch to the alert message
		Alert alert =driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println("Alert Text: " + alert.getText());
		
		alert.sendKeys("Bakshu");
		Thread.sleep(3000);
		
		alert.accept();
		
		//switch back to the main page
		driver.switchTo().defaultContent();
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
