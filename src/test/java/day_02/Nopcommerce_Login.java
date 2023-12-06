package day_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dash board */

public class Nopcommerce_Login {

	public static void main(String[] args) throws InterruptedException {
	
//1) Launch browser
		WebDriver driver=new ChromeDriver();
		
//2) open url
		//URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	Thread.sleep(5000);
	
	    //Web page to maximize
	  driver.manage().window().maximize();
	
//3) Provide username  - admin@yourstore.com
	
	 WebElement id=  driver.findElement(By.id("Email"));
	 id.clear(); //Already mail are entered ,so first clearning the default email without clearning, if we enter email means i will enter beside the default email,and show as invalid email.  
	 Thread.sleep(5000);
	 id.sendKeys("admin@yourstore.com");
	  
	  
//4) Provide password  - admin
	  
	 WebElement pswd= driver.findElement(By.id("Password"));
	 pswd.clear();
	 Thread.sleep(5000);
	 pswd.sendKeys("admin");
	  
//5) Click on Login button
	  
WebElement Login= driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
           Login.click();
           
//6)Verify the title of dashboard page   
        //	Exp title : Dashboard / nopCommerce administration
           
        /*   String act_Title=driver.getTitle();
           String Exp_title ="Dashboard / nopCommerce administration";
           
           if(act_Title.equals(Exp_title))
           {
        	   System.out.println("Test is pass");
           }
           else
           {
        	   System.out.println("Test is fail");
           }*/
           
 //7) Verify Dash board
               //Exp Lable : Dashboard
           
         WebElement Lable_ele= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1"));
          
       String act_Lable= Lable_ele.getText();
       String Exp_Lable ="Dashboard" ;
       
       if(act_Lable.equals(Exp_Lable))
       {
    	   System.out.println("Test is pass");
       }
       else
       {
    	   System.out.println("Test is fail"); 
       }
       
       driver.close();
   	//driver.quit();
       
	}

}
