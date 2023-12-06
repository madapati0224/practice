package day_30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpages {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
//Scroll bar by using index
		
	//	js.executeScript("window.scrollBy(0,2000)","");
	//System.out.println(js.executeScript("return window.pageYOffset;"));//2000
	
//Scroll by element
		
	//WebElement ele=	driver.findElement(By.xpath("//img[@alt='Flag of India']"))	;	
	//js.executeScript("arguments[0].scrollIntoView();", ele);
	
//scroll bar index at that img
	
	//System.out.println(js.executeScript("return window.pageYOffset;")); //1058
	
//3) scroll down till end of the page/document
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	Thread.sleep(3000);
	
	// go back to initial position
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		

	}

}
