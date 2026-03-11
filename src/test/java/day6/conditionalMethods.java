package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://elementalselenium.com/");
		driver.get("https://demo.nopcommerce.com/");
						
		//isDisplayed() - we can check display status of the element
		boolean img_display= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(img_display);
		
		
		//isEnabled() - we can check enable/disable status of the element/ operational element
		boolean enable= driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println(enable);
		
		//isSelected() - we can use to check the element is selected or not
		WebElement select = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		System.out.println(select.isSelected());
		
		select.click();
		System.out.println(select.isSelected());
		
		
		
		
	}

}
