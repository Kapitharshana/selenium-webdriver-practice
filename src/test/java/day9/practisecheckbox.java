package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practisecheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//select specific checkbox
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		
		
		/*List <WebElement> checkboxes= driver.findElements(By.xpath("//tbody//td//input[@type='checkbox']"));
		
		for(WebElement  box: checkboxes) {
			box.click();
		}*?
		
		
		//select first 2 checkboxes
		/*List <WebElement> checkboxes= driver.findElements(By.xpath("//tbody//td//input[@type='checkbox']"));
		for(int i=0; i<2; i++) {
			checkboxes.get(i).click();
		}*/
		
		//select last 2 
		List <WebElement> checkboxes= driver.findElements(By.xpath("//tbody//td//input[@type='checkbox']"));
		for(int i=3; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}

		//unselect the selected last 2
        for(int i=0; i<checkboxes.size(); i++) {
			
			if(checkboxes.get(i).isSelected()){
				
			checkboxes.get(i).click();
		}
			}
		
	
		

	}

}
