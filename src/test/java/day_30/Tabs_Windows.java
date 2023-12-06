package day_30;

/*Below 2 commands are introduced from selenium4
 * newWindow(WindowType.TAB)
 * newWindow(WindowType.WINDOW)
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_Windows {

	public static void main(String[] args) {
		
		//Switch between to 2 tables and different browser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
	    
		//driver.switchTo().newWindow(WindowType.TAB); //Switch to other tab in same browser
		driver.switchTo().newWindow(WindowType.WINDOW);//open the another browser
		
		driver.get("https://www.flipkart.com/");
	}

}
