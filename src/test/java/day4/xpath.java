package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
						
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//x path with single attribute
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Tshirt");
		
		//x path with multiple attribute
		driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Tshirt");

		//static elements 
		//and or 
		driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Tshirt");
		driver.findElement(By.xpath("//input[@name='q' or @placeholder='Sea']")).sendKeys("Tshirt");

		//x path with linked text and inner text
		
		driver.findElement(By.xpath("//*[text()='Electronics']")).click();
		
		boolean answer= driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		System.out.println(answer);
		
		//xpath with contains
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("Tshirt");
		
		//xpath with contains
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Tshirt");

		//chained xpath
		boolean state= driver.findElement(By.xpath("//div[@class='picture']/a/img")).isDisplayed();
		System.out.println(state);
	}
}
