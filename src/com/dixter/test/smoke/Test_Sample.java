package com.dixter.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dixter.lib.utils.CreateDriver;

public class Test_Sample {

	WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		driver=CreateDriver.getDriverInstance();
	}
	
	@AfterMethod
	public void postcondtion()
	{
		driver.close();
	}
	
	@Test
	public void test_sample()
	{
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	
}
