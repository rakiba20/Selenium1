package com.ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
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
	    
	    WebElement cookies = driver.findElement(By.xpath("//*[@id=\"__tealiumImplicitmodal\"]/div/button/span[1]"));
	    cookies.click();
	    
	    //driver.switchTo().alert().dismiss();
	    
	    WebElement signuppage = driver.findElement(By.xpath("//*[@id=\"DOARegisterLink\"]"));
	    signuppage.click();
	    
	    WebElement name = driver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]"));
	    name.sendKeys("Rakiba20");
	    
	    WebElement email = driver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
	    email.sendKeys("Rakiba20@gmail.com");
	    
	    WebElement userId = driver.findElement(By.xpath("//*[@id=\"ups-user_id_input\"]"));
	    userId.sendKeys("rakiba");
	    
	    WebElement password = driver.findElement(By.xpath("//*[@id=\"ups-user_password_input\"]"));
	    password.sendKeys("Rakiba123@");
	    
	    
		Select country = new Select(driver.findElement(By.xpath("//*[@id=\"main\"]/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[3]/div/div[1]/div/select")));
		 country.selectByVisibleText(" Afghanistan +93 ");
	    
	    WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ups-checkbox_group\"]/div/label"));
	    checkbox.click();
	    
	    WebElement signup = driver.findElement(By.xpath("//*[@id=\"main\"]/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button"));
	    signup.click();
	}

}
