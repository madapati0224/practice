package day_26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandling_using_SwitchTo {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
//get windowids
		
	Set<String>	Winids=driver.getWindowHandles(); //2 ids will return
	
//As it set we can retrive single id as it doesnot follow index so we convert set to list
	
	//By using List-->Approach1
	
/*	List <String> listWinids=new ArrayList(Winids);//coverted set to list
	
	String parentwinid=listWinids.get(0);
	String childwinid=listWinids.get(1);
	
//Switch to child
	// driver.switchTo().window(childwinid);
	// driver.findElement(By.xpath("//a[text()='Company']")).click();
	 
//Switch to parent
	 driver.switchTo().window(parentwinid);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");*/
	 
//Approach2 -->By using for each loop
	
	for(String wid:Winids)
	{
		String Title=driver.switchTo().window(wid).getTitle();//switch to id
		
		if(Title.equals("OrangeHRM HR Software | OrangeHRM"))
		{
		driver.findElement(By.xpath("//input[@name='action_request']")).click();
	}
		}
	
//To close particular browser
	
	for(String winid:Winids)
	{
		String title=driver.switchTo().window(winid).getTitle();
		
		if( title.equals("OrangeHRM"))
		{
			driver.close();
		}
	}
	
//closing specific browser windows based on choice-example
			// 1-x  2-y  3-z  4-a  5-b...........
			
			/*for(String winid:windowIDs)
			{
				String title=driver.switchTo().window(winid).getTitle();
				
				if( title.equals("x") || title.equals("y") || title.equals("z"))
				{
					driver.close();
				}
			}*/
		
		

	}

}
