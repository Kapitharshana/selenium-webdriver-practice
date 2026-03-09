package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Test case
//launch browser (chrome)
//open url https://demo.opencart.com
//validate the title
//close the browser


public class FirstTestCase {
	public static void main(String[]args) {
		
		//launch browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		//open url https://demo.opencart.com
		driver.get("https://www.opencart.com/");
		
		//validate the title
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		if (act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		//close browser
		driver.quit();
		
		
		
	}

}
