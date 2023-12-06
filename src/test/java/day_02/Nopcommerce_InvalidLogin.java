package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nopcommerce_InvalidLogin {

	public static void main(String[] args) throws InterruptedException {
		
		/*1) Launch browser
		2) open url
			URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		3) Provide username  - admin@yourstore.com
		4) Provide password  - admin
		5) Click on Login button 
		6) Verify the title of dashboard page   
			Exp title : Dashboard / nopCommerce administration
		7) Verify Dash board */
		
//1) Launch browser
		WebDriver driver=new ChromeDriver();
		
//2) open url
		   //URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
Thread.sleep(5000);

          //Web page to maximize
      driver.manage().window().maximize();

//3) Provide username  - admin@yourstore.com
		
		WebElement id=driver.findElement(By.id("Email"));
		id.clear();
		id.sendKeys("admin@yourstore.com");
		
//4) Provide password  - admin
		
		WebElement pswd=driver.findElement(By.id("Password"));
		pswd.clear();
		pswd.sendKeys("admin1");
		
//5) Click on Login button
		
		WebElement Login=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		          Login.click();
		         
//6) Verify the title of dashboard page   
					//Exp title : Dashboard / nopCommerce administration
		          
		 /*  String act_title=driver.getTitle();
		   String Exp_title="Dashboard / nopCommerce administration";
		   
		  if(act_title.equals(Exp_title))
		  {
			  System.out.println("Test is pass");
		  }
		  else
		  {
			  System.out.println("Test is fail");  
		  }*/
		  
//7) Verify Dash board
		          
  String act_Lable=""; //Declaration of act_Lable 
  try
  {
   driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();//Return text i.e., Dash board
  }
  
     catch(NoSuchElementException e) 
 // catch(Exception e) 
    	 {
	 // e.printStackTrace();
  }
  
  String Exp_Lable="Dashboard";
 
 if(act_Lable.equals(Exp_Lable))
 {
	  System.out.println("Test is pass");
 }
 else
 {
	  System.out.println("Test is fail");  
 }
		
	driver.close()	;
	//driver.quit();
		
		


	}

}
