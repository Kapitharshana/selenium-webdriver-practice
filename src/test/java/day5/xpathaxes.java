package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		
		//xpath axes
		//self, parent, child, descendent, ancestor, preceding, following, following-sibling, preceding-sibling 
    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		
		//self -selects the current node
		String text= driver.findElement(By.xpath("//a[contains(text(),'GSFC')]/self::a")).getText();
		System.out.println(text);
		
		//parent -selects the parent of the current node(always one)// //
		String ptext= driver.findElement(By.xpath("//a[contains(text(),'GSFC')]/parent::*")).getText();
		System.out.println(ptext); //(actually it is div)
		
		//child -selects all children of the current node (one or many)
		List<WebElement> childs= (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr/child::td"));
		System.out.println("num of child elements: " +childs.size());
		
		//select all the ancestor
	    String atxt= driver.findElement(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr")).getText();
	    System.out.println(atxt);
	    
	    //descendant    ex: //a[contains(text(),'GSFC')]/ancestor::tr/ descendant::a
	    List<WebElement> grandchilds= (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr/descendant::td"));
	    System.out.println("num of grand child elements: " +grandchilds.size());
	    
	    //following-selects everything in the document after the closing tag of the current node
	    List<WebElement> foll= (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr/following::div"));
	    System.out.println("followings: " +foll.size());
	    
	    
	  //preceding-selects everything in the document before the starting tag of the current node
	    List<WebElement> prec= (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr/preceding::td"));
	    System.out.println("precedings: " +prec.size());
	    
	  //following-selects all sibilings in the document after the closing tag of the current node 
	   List<WebElement> foll_sib= (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr/following-sibling::tr"));
	   System.out.println("followings: " +foll_sib.size());
	    
	  //preceding-selects all sibilings in the document after the closing tag of the current node 
	    List<WebElement> prec_sib= (List<WebElement>) driver.findElements(By.xpath("//a[contains(text(),'GSFC')]/ancestor::tr/preceding-sibling::tr"));
	    System.out.println("precedings: " +prec_sib.size());
	}

}
