package com.gautham.Practise.MyPractise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest{
	
	public static void main(String[] a) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\GauthamWS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
	File file=	scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("G:\\GauthamWS\\1.jpg");

    //Copy file at destination

    FileUtils.copyFile(file, DestFile);
	}
}
