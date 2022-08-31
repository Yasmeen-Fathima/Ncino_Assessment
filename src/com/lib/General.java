package com.lib;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.Log;

import java.awt.Robot;
import java.time.Duration;

public class General extends Global{
	
	public void openapplication()  {
		//Qn: What does setProperty do?
		System.setProperty("webdriver.chrome.driver", chromedriverpath);
		//Qn: What is happening here
		driver = new ChromeDriver();
		//difference between get() and navigate().to()
		driver.get(url);
		//
		driver.manage().window().maximize();
		Log.info("Application Opened");
		
	}
	
	
	public void addtodo() throws Exception {
		
		
		driver.findElement(labXpath).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(angularText).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Log.info("Adding the Todo list");
		driver.findElement(todoXpath).sendKeys(text);
		Thread.sleep(3000);
		r = new Robot();
		r.keyPress(enter);
		r.keyRelease(enter);
		Thread.sleep(3000);
		Log.info("Getting the local storage information");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		str = (String) js.executeScript("return window.localStorage.getItem('angular2-todos')");
		
	}
	
	public void updatetodo() throws Exception {
		Log.info("Writing the information into Local Storage");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.localStorage.setItem(arguments[0],arguments[1])","angular2-todos",str);
		
		driver.findElement(labXpath).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(3000);
		driver.findElement(angularText).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Thread.sleep(3000);
		item = driver.findElement(itemXpath);
	    act = new Actions(driver);
	    Log.info("Updating the Todo list");
		updateact = act.moveToElement(item).doubleClick().build();
		updateact.perform();
		Thread.sleep(3000);
		
		//System.out.println();
		
		r = new Robot();
				
		r.keyPress(U);
		r.keyRelease(U);
		r.keyPress(P);
		r.keyRelease(P);
		r.keyPress(D);
		r.keyRelease(D);
		r.keyPress(A);
		r.keyRelease(A);
		r.keyPress(T);
		r.keyRelease(T);
		r.keyPress(E);
		r.keyRelease(E);
		r.keyPress(D);
		r.keyRelease(D);
		r.keyPress(enter);
		r.keyRelease(enter);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.textToBePresentInElement(item,"Updated"));
		//Thread.sleep(3000);
		
	}
	
	public void closeapplication() {
		driver.quit();
		Log.info("Application Closed");
	}
	
	
	
}