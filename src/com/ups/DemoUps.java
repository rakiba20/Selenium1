package com.ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoUps {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    WebElement login = driver.findElement(By.xpath("//*[@class='acq_main_header_signupLogin']"));
	    login.click();
	    
	    WebElement cookies = driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/div/h2"));
	    cookies.click();
	    
	    //driver.switchTo().alert().dismiss();
	    
	    
	}

}
