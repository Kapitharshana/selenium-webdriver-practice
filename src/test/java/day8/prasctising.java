package day8;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prasctising {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1.Provide some String search for it 
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("laptop");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//2.count number of links
		//List<WebElement> childs= (List<WebElement>) driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//child::div"));
		 List<WebElement> childs= (List<WebElement>) driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//ancestor::a"));
		 System.out.println("num of child elements: " +childs.size());
			
		 //3.Print id of each link
		Set <String> windowsid = null;
		//3.click on each link using for loop
		for (WebElement child : childs) {
			child.click();
			
			windowsid= driver.getWindowHandles();
		}
		System.out.println(windowsid);
		
		
		//4.Print title of each new opened window
        for(String winid :windowsid ) {
			
			String title= driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
		//5.close specific window	
			if(title.equals("Laptop battle - Wikipedia")) {
				driver.close();
			}
			
			
		}
							
		
		
		
	}

}
