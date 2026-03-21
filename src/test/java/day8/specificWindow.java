package day8;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class specificWindow {

	public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
		
		driver.get("https://elementalselenium.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Selenium Docs")).click();
		
		Set <String> windowsid= driver.getWindowHandles();
		
        for(String winid :windowsid ) {
			
			String title= driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
			if(title.equals("The Selenium Browser Automation Project | Selenium")) {
				driver.close();
			}
			
			
		}

	}

}
