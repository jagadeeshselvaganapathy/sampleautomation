package com.employee;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class CameraAccessTest {
	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "jagadeesh_fKpl7b");
		caps.setCapability("browserstack.key", "JybmMjv9aYXwps7TMbpC");

       // Set URL of the application under test
	//	caps.setCapability("app", "bs://e1e0b3b2426ca7d44371c959b979ee1f2015e43f");
    	

       // Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
    	caps.setCapability("os_version", "9.0");

       // Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");
		caps.setCapability("autoGrantPermissions", true);

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		WebDriver driver = new RemoteWebDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		Thread.sleep(15000);
//		   driver.get("calculator_app_url");
//		   Thread.sleep(5000);
/*		      driver.findElement(By.id("btn1")).click();
		      Thread.sleep(5000);
		      driver.findElement(By.id("btn2")).click();
		      Thread.sleep(5000);
		      driver.findElement(By.id("btn3")).click();
		      Thread.sleep(5000);
		      driver.findElement(By.id("btn4")).click();
	*/	      
		      // Get the result and print it
//		      String result = driver.findElement(By.id("result")).getText();
//		      System.out.println("Result: " + result);
		driver.get("https://www.facebook.com/");
//		boolean contains = driver.getCurrentUrl().contains("xyz");
//		Assert.assertTrue(contains);
	
		
		WebElement element = driver.findElement(By.name("email"));
		
		element.sendKeys("jagadeesh");

		// Quit the driver
		driver.quit();
	}
}
