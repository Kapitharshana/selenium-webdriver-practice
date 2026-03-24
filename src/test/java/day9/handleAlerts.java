package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//click for JS alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		//click for JSalert confirm
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		Alert myaalert=driver.switchTo().alert();
		myaalert.accept();
		myaalert.dismiss();
		
		
		//click for JS prompt
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert myaaalert=driver.switchTo().alert();
		//myalert.dismiss();
		myaaalert.sendKeys("Welcome");
		myaaalert.accept();
        		

	}

}
