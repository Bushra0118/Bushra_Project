package com.Facebok.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();//upcasting polymorphism
		// Maximize browser
		driver.manage().window().maximize();
		// Open facebook
		driver.get("http://www.facebook.com");
	}

}
