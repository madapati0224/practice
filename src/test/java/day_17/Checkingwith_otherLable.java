package day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Lable_Exp  : Dashboard
7) close browser */

public class Checkingwith_otherLable {

	public static void main(String[] args) throws InterruptedException {
		
// 1) Launch browser 
		WebDriver driver=new ChromeDriver();
		
// 2) open url
		//https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		 
		//Web page to maximize
		driver.manage().window().maximize();
		
// 3) Provide username  - Admin
		driver.findElement(By.name("username")).sendKeys("Admin");
		
// 4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
// 5) Click on Login button
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Login.click();
		Thread.sleep(5000);
		
// 6) Verify the title of dashboard page (Another type of validation point)  
		//Lable_Exp  : Dashboard
		
WebElement Lable=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
   
Thread.sleep(5000);

		String act_Lable=Lable.getText();//Dash board
		String Exp_Lable="Dashboard";
		
		if(act_Lable.equals(Exp_Lable))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		//driver.quit();
		

	}

}
