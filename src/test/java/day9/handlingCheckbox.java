package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select specific check box
		//driver.findElement(By.xpath("//label[normalize-space()='Monday']")).click();
		
		//select all checkboxes
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type=\"checkbox\" ]"));
		
		/*for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}*/
		
				
		//select last 3 checkboxes --> 4,5,6
		/*for(int i=4; i<=checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}*/
		
				
		//select first three checkboxes -->0,1,2
		for(int i=0; i<3; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		//unselect the selected checkboxes
		for(int i=0; i<checkboxes.size(); i++) {
			
			if(checkboxes.get(i).isSelected()){
				
			checkboxes.get(i).click();
		}
			}
		

	}

}
