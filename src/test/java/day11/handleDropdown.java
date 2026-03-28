package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//1.select dropdown
		WebElement country= driver.findElement(By.xpath("//select[@id='country']"));
		Select countries= new Select(country);
		
		//countries.selectByVisibleText("Australia");
		//countries.selectByValue("LK"); //SriLanka
		//countries.selectByIndex(2);
		
		List <WebElement> selectoptions= countries.getOptions();
		System.out.println(selectoptions.size());
		
        for(int i=0 ; i<selectoptions.size(); i++) {
        	System.out.println(selectoptions.get(i).getText());
        }
	}

}
