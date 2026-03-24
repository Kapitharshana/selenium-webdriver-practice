package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticatedpopup {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
			
		//handling authenticated popups
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
