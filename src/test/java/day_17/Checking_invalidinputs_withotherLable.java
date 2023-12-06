package day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

public class Checking_invalidinputs_withotherLable {

	public static void main(String[] args) throws InterruptedException {
//1) Launch browser
		WebDriver driver=new ChromeDriver();
		
//2) open url
	    //https://opensource-demo.orangehrmlive.com/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);//wait 5sec before executing next thread
		
		//Web page to maximize
			driver.manage().window().maximize();
		
//3) Provide username  - Admin
		driver.findElement(By.name("username")).sendKeys("Admin1");//Entered invalid user name
		
//4) Provide password  - admin123
		driver.findElement(By.name("password")).sendKeys("admin1234");//Entered invalid password
		
//5) Click on Login button 
		WebElement Login=driver.findElement(By.xpath("//*['@id=app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		     Login.click();
		 Thread.sleep(5000);//wait 5sec before executing next thread
		 
//6) Verify the title of dashboard page   
		 	//Lable_Exp  : Dashboard
		//Comparing actual and expected	
		 
	//Due to getting EXCEPTION AT h6 element( org.openqa.selenium.NoSuchElementException) it throwing the exception and rest of the code terminated..So we can Handle the exception by TRY AND CATCH block.	
		 String  act_Lable=""; //Declaration for actual string// null means unknown value so we can't compare Xcp_Lable with act_Lable .so we have mention ""  it will give value to act_Lable ,then comparison is possible
		 try
		 {
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText(); //returns text i.e.,dash board
  
	  }
		// catch(NoSuchElementException e) //If we know exception we can mention directly in catch
		 catch(Exception e)   //Exception is a class which contains all the Exceptions
		 {
			e.printStackTrace(); //To know the type of exception occurred
			 
		 }
		 
 String Exp_Lable="Dashboard";
    
    if(act_Lable.equals(Exp_Lable))
    {
     System.out.println("Test is pass");
	}
    else
     System.out.println("Test is Fail");
    
    //driver.quit();
    driver.close();
    	

}}
