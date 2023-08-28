package com.base;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void getBrowser(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
				}
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static String title() {
		String title1=driver.getTitle();
		return title1;
	}

	public static WebElement locators(String locator, String value) {
		if(locator.equals("id")) {
			WebElement findElement=driver.findElement(By.id(value));
			return findElement;
			}
		else if(locator.equals("name")) {
			WebElement findElement=driver.findElement(By.name(value));
			return findElement;
			}
		else if(locator.equals("xpath")) {
			WebElement findElement=driver.findElement(By.xpath(value));
			return findElement;
			}
		else {
			WebElement findElement=driver.findElement(By.tagName(value));
			return findElement;
		}
		}
	public static void textSend(WebElement findElement,String values) {
		findElement.sendKeys(values);
		}
	public static void textClick(WebElement findElement) {
		findElement.click();
	}
//	public static void screenShot(String name) throws IOException {
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		File src=tk.getScreenshotAs(OutputType.FILE);
//		File des=new File("D:\\example file\\"+name+".jpg");
//		FileUtils.copyFile(src, des);
//		}
	public static void staticWait(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	public static void quitBrowser() {
		driver.quit();
	}
	}

