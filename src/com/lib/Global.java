package com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Global {
	static ChromeOptions options;
	static String str;
	static RemoteWebDriver driver; //to access the browser
	static WebElement item; //
	static Actions act;//object to perform mouse over action
	static Action updateact; //interface to represent single user action, in this case to perform doubleClick()
	static Robot r; //object to enter key values
	static String url = "http://todomvc.com";
	static String chromedriverpath = "chromedriver1.exe";
	static By labXpath = By.xpath("//*[@id=\"tabsContent\"]/paper-tab[3]/div"); //using relative xpath
	static By angularText = By.linkText("Angular 2.0"); //using link text
	static By todoXpath = By.xpath("/html/body/todo-app/section/header/input"); //using absolute xpath
	static String text = "TestCase1"; //Add value to Todo
	static By itemXpath = By.xpath("//*[@class=\"todo-list\"]/li[1]/div/label"); //relative xpath
	
	//keyboard values 
	static int enter = KeyEvent.VK_ENTER;
	static int U = KeyEvent.VK_U;
	static int P = KeyEvent.VK_P;
	static int D = KeyEvent.VK_D;
	static int A = KeyEvent.VK_A;
	static int T = KeyEvent.VK_T;
	static int E = KeyEvent.VK_E;
	
	
}