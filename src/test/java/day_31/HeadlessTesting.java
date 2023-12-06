package day_31;


/*HeadlessTesting
-----------------
without opening webapplication/or UI testcases will execute */

 
		
		import java.net.SocketException;
		import java.time.Duration;
		import java.util.NoSuchElementException;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.edge.EdgeDriver;
		import org.openqa.selenium.edge.EdgeOptions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.FluentWait;
		import org.openqa.selenium.support.ui.Wait;
		import org.openqa.selenium.support.ui.WebDriverWait;

		import com.google.common.base.Function;

		
		public class HeadlessTesting {

			public static void main(String[] args) throws InterruptedException  {
				
			
		 ////////    chrome browser    ///////////		
				
				//Appraoch1) Headless mode
				/*ChromeOptions options=new ChromeOptions();
				options.setHeadless(true);
				
				
				WebDriver driver=new ChromeDriver(options);
				*/
				
				
				
//////////		    edge browser    /////////////
				
				//Appraoch1
			    EdgeOptions options=new EdgeOptions();
				options.setHeadless(true);
				
				
				WebDriver driver=new EdgeDriver(options);
				
				
				
				
						
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				Thread.sleep(3000);
					
				driver.findElement(By.name("username")).sendKeys("Admin");
					 
				driver.findElement(By.name("password")).sendKeys("admin123");
						
				driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				
				// validation
				
				String act_title=driver.getTitle();
				String exp_title="OrangeHRM";
				
				if(act_title.equals(exp_title))
				{
					System.out.println("Login test passed");
				}
				else
				{
					System.out.println("Login Test failed");
				}
				
			//7. close browser
				
				driver.quit();
		
	}

}
