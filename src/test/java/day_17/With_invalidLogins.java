package day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_invalidLogins {

	public static void main(String[] args) throws InterruptedException {
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
		
//1) Launch browser
		WebDriver driver=new ChromeDriver();
		
//2)open url
	    //https://opensource-demo.orangehrmlive.com/
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000); //wait for 5seconds after executed the thread
		
		//Web page to maximize
		driver.manage().window().maximize();
		
//3) Provide username  - Admin
		
		driver.findElement(By.name("username")).sendKeys("Admin1"); //Entered invalid username
		
//4) Provide password  - admin123
		
		driver.findElement(By.name("password")).sendKeys("admin1234");//Entered invalid password
		
// 5) Click on Login button
		
	WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();

// 6) Verify the title of dash board page   
		// Expected title : OrangeHRM
	 //comparing expected with actual result
		
		String act_Title=driver.getTitle();
		String Exp_Title="OrangeHRM";
		
		if(act_Title.equals(Exp_Title))
		{
			System.out.println("Test is passed");
		}
		else
			System.out.println("Test is fail");
		
//After execution we will get "Test is passed"Without entering into Dash board page because
	/*Some times Titles are same in before login page and after login page..("INSPECT AND CLICK ON HEAD DROPDOWN AND CHECK TITLE NAME")So it may give improper output.
	   *But normally Every page has a unique title
	   * We can validate in 2 ways 1 is with Title and other with by using other Label.
	   * so lets check with other Label element bec Titles are same.
   */
		
	//	driver.quit();
}
}