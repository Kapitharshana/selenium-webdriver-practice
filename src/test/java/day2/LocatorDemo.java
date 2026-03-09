package day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.opencart.com/");
		driver.get("https://www.demoblaze.com/index.html");
		
		//locators
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logodisplayed= driver.findElement(By.id("nava")).isDisplayed();		
		System.out.println(logodisplayed);
		
		//linketext & partialLinkText
		driver.findElement(By.linkText("Laptops")).click();
		driver.findElement(By.partialLinkText("Monit")).click();
		
		//classname
		List <WebElement> headerlink =driver.findElements(By.className("nav-item"));
		System.out.println("Num of links in the header : " + headerlink.size());
		
		//tag 
		List <WebElement> nameoftag =driver.findElements(By.tagName("a"));
		System.out.println("Number of anchor tag in the page : " + nameoftag.size());
		
		//image size
		List <WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: " +images.size());
		
		

	}

}
