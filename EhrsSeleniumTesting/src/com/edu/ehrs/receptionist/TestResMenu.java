package com.edu.ehrs.receptionist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestResMenu {
	
	
	
WebDriver driver;
	
	public void invokeBrowser()
	
		{
		
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\morea\\Downloads\\SProject\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
					
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		/*	driver.findElement(By.tagName("html")).sendKeys(
					Keys.chord(Keys.CONTROL, Keys.ADD));
			driver.findElement(By.tagName("html")).sendKeys(
					Keys.chord(Keys.CONTROL, Keys.ADD));
			driver.findElement(By.tagName("html")).sendKeys(
					Keys.chord(Keys.CONTROL, Keys.ADD));
			driver.findElement(By.tagName("html")).sendKeys(
					Keys.chord(Keys.CONTROL, Keys.ADD));
			*/
			
			driver.get("http://localhost:3000/login/");
			
		
			
			//JavascriptExecutor executor = (JavascriptExecutor)driver;
			//executor.executeScript("document.body.style.zoom = '350%'");
						
			
			driver.findElement(By.name("ID")).sendKeys("2S81r");
			driver.findElement(By.name("password")).sendKeys("babatunde");
			
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
			
			
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/body/header/div/form/input")).click();
	

			//WebElement body = driver.findElement(By.tagName("body"));
		//	body.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			
			//body.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			
			
			
			
			driver.findElement(By.xpath(" //*[@id=\"root\"]/div/body/header/div/body/header/nav/div/a[1]/i ")).click();
			//Test Oracle
			
			String at = driver.getTitle();
			String et = "React App";
			//driver.close();
			if(at.equalsIgnoreCase(et))
			{
				System.out.println("Test successful");
			}
			else
			{
				System.out.println("Test Unsuccessful");
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//	driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	}
	
		
public static void main(String args[])
	{
	TestResMenu testobj =new TestResMenu();
		testobj.invokeBrowser();
	
	
	}
			
	
	
	
	

}
