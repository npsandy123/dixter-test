package com.dixter.lib.ui;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));		
	}
	
	public WebElement getUsernameTextbox()
	{
		try
		{
			WebElement element=driver.findElement(By.name("email"));
			return element;
		}catch(NoSuchElementException e)
		{
			return null;
		}
		
	}
	
	public WebElement getPasswordTextBox()
	{
		try
		{
			return driver.findElement(By.name("pass"));
		}catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getLoginButton()
	{
		try
		{
			return driver.findElement(By.cssSelector("input[type='submit']"));
			
		}catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public String gettitle()
	{
		try
		{
			String Expectedtitle= driver.getTitle();
			return Expectedtitle;
		}catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
	public WebElement getLoginerrormsg()
	{
		try
		{
			return driver.findElement(By.xpath("//span[text()='Username or Password is Invalid. Please try again.']"));
					
		}catch(NoSuchElementException e)
		{
			return null;
		}
	}
	
}
