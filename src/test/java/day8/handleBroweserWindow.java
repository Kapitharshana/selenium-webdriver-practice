package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBroweserWindow {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://elementalselenium.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Selenium Docs")).click();
		
		Set <String> windowsid= driver.getWindowHandles();
		
		//Approach 1:
		//now change the set into list (cz set don't have get method access)
		//List <String> windowList= new ArrayList(windowsid);
		
		//parentid  child 
		//String childId= windowList.get(1);
		
		//child id
		//String parentId= windowList.get(0);
		
		//System.out.println(driver.getTitle());
		
		//switch to child window
		//driver.switchTo().window(childId);
		//System.out.println(driver.getTitle());
		
		//switch to child window
		//driver.switchTo().window(parentId);
		//System.out.println(driver.getTitle());
		
		//approach 2
		for(String winid :windowsid ) {
			
			String title= driver.switchTo().window(winid).getTitle();
			
			if(title.equals("Home | Elemental Selenium")) {
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
