package com.gautham.Practise.MyPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest{
	@Test
	public static void main() throws IOException
	{
		System.out.println("Execution started");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		System.out.println(driver.getTitle());
		Assert.assertEquals(true, true);
	}
	@Test
	public static void main2() throws IOException
	{
		Assert.assertEquals(true, false);
	}
	@Test
	public static void main3() throws IOException
	{
		Assert.assertEquals(true, false);
	}
}
