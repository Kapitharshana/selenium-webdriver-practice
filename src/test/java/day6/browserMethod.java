package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethod {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://elementalselenium.com/");
		
		Thread.sleep(5000); //open the next browser in 5ms
		
		driver.findElement(By.linkText("Selenium Docs")).click(); // now this will open to new browser.
		
		Thread.sleep(5000);
		
		//driver.close(); // this will close the 1st window //it only close one single browser at a time
		
		driver.quit(); //this will close all the browser page at once.
	}

}
