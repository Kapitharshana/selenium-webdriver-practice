package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleframes {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//frame 1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		//switch to frame 1
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent(); //go back to the page
		
		//frame 2
		WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		//switch to frame 2
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome");
			
		driver.switchTo().defaultContent(); //go back to the page

		//frame 3
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		//switch to frame 3
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcome");
		
		//inner iframe -part of frame 3
		driver.switchTo().frame(0); //switching to frame using index
		//click radio button inside the frame
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();			
		driver.switchTo().defaultContent(); //go back to the page
	}

}
