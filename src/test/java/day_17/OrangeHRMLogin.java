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
	Exp title : OrangeHRM
7) close browser */


public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
//1) Launch browser	
		WebDriver driver=new ChromeDriver();
		
//2) open url	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000); //wait for 5seconds before executing next thread
		
//Web page to maximize
	//	driver.manage().window().maximize();
		
//3) Provide username  - Admin
		
	//WebElement username=driver.findElement(By.name("username"));
	//username.sendKeys("Admin");
	
	            //OR
		driver.findElement(By.name("username")).sendKeys("Admin");
		
//4) Provide password  - admin123
	
	 WebElement pswd=  driver.findElement(By.name("password"));
	 pswd.sendKeys("admin123");
	
	           //OR
	//  driver.findElement(By.name("password")).sendKeys("admin123");
		
//5) Click on Login button
	 
	//WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	//	login.click();
		
		      //OR 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

//6) Verify the title of dash board page -Expected title : OrangeHRM  
		
	String act_Title= driver.getTitle(); // Getting the Title of the page at run time
	String exp_Title="OrangeHRM"; //our excepted Title
	
	if(act_Title.equals(exp_Title)) //Compare actual and excepted Title
	{
		System.out.println("Test is passed");
	}
	else
	{
		System.out.println("Test is failed");
	}
	
//7) close browser
	
	driver.quit();
	
	
	
		
	
	
	}

}
