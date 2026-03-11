package day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		//get(url) - opens the URl on the browser
		//driver.get("https://the-internet.herokuapp.com/login");
		//Thread.sleep(5000);   // using for waiting for the page load
		
		driver.get("https://elementalselenium.com/");	
		
		//getTitle()- returns the title of the page
		System.out.println(driver.getTitle());
		
		//getCurrentUrl()- Returns the URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns the ID of the single browser window
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles() - returns ID of the multiple browser windows
        driver.findElement(By.linkText("Selenium Docs")).click();
        System.out.println(driver.getWindowHandles());
        
        Set <String> windowsid= driver.getWindowHandles();
        System.out.println(windowsid);
	}

}
