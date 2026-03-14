package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleepcommand {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000); //pause the execution

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	}

}
//This is a ususal java method , not the selenium specific method. 
//adv: easy to use
//disadv : If the time is not suffiient then , it wwill throw exception , multiple times
