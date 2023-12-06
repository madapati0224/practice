package day_22;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()
*/

public class Getmethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\HP\\Downloads\\chromedriver-win64.exe");
		
		WebDriver driver=new ChromeDriver();
		
//get(url):		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//getTitle()
		System.out.println("Title of the page:"+driver.getTitle()); //OrangeHRM
		
//getCurrentURL()
		System.out.println("current url:"+driver.getCurrentUrl());//opensource-demo.orangehrmlive.com/web/index.php/auth/login

//getPageSource()
	  //System.out.println("page source:"+driver.getPageSource());
		
//getWindowHandle()
		String windid=driver.getWindowHandle();
		System.out.println("Single window id:"+windid); //068383687BB1910836C1DDFD1F64F500-id is unique ..for every time new id will be generated
		
//getwindowHandles()
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> winids=driver.getWindowHandles();//return multiple ids
		
	//	System.out.println("multiple id's:"+winids);//multiple id's:[DB89BC33EDDE717E07F2E032ECA91266(1st window id), 95683B8A0D56F84B00A76A3FBE1B052C(2nd window id)]
	//or
//By using Enhanced for loop
		for(String winid:winids)
		{
			System.out.println("Multiple window id's:"+winid);//Multiple window id's:F6540C97954978C195CEAB3F7BE6DA44
			                                                  //Multiple window id's:C582A7FF8687B0F14B6C5A8296C100AF
		}

	}

}
