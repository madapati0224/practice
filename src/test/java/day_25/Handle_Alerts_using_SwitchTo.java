package day_25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Alerts_using_SwitchTo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
//-----------------------------------------Simple Alert--------------------------------------------------------------
		
//Sometimes alert window will take time to dispaly, in that case EXPLICITWAIT we can use(To avoid synchronization problem)
		
	/*	WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10)); //Declartion
		 
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
	Alert alertbox=mywait.until(ExpectedConditions.alertIsPresent()); //implementation
		
		System.out.println(alertbox.getText()); //Return the text inside the alert box.
		
		alertbox.accept(); //click on ok
	
//Validation
		
		String excepted_result="You successfully clicked an alert";
		
		String actual_result=driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		
		System.out.println(actual_result); //You successfully clicked an alert
		
		if(actual_result.equals(excepted_result))
		{
			System.out.println("Test pass");
			
		}
		else
		{
			System.out.println("Test fail");
		}
		*/
		
//By using switchTo().alert()
		
/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

Alert  alertbox=driver.switchTo().alert();//switch to alert window
 
System.out.println(alertbox.getText());

alertbox.accept();*/


//--------------------------------Confirm alert window------------------------------------------

/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

Alert alertbox1=driver.switchTo().alert();

System.out.println(alertbox1.getText());//I am a JS Confirm

alertbox1.accept(); //click ok
//alertbox1.dismiss();//click cancel

//Validation

String except_Result="You clicked: Ok";

String Actual_result=driver.findElement(By.xpath("//p[text()='You clicked: Ok']")).getText();
System.out.println(Actual_result);//You clicked: Ok

if(Actual_result.equals(except_Result))
{
	System.out.println("Test pass");
}
else
	System.out.println("Test fail"); */
	

//----------------------------------Prompt Alert window--------------------------------------------------------------

/*driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
 

Alert alertwindow=driver.switchTo().alert();
System.out.println(alertwindow.getText()); //I am a JS prompt
alertwindow.sendKeys("welcome");
//alertwindow.accept();
alertwindow.dismiss();

//validation

		String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_text="You entered: welcome";
		
		System.out.println(act_text);
		System.out.println(exp_text);
		
		if(act_text.equals(exp_text))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/


		
		
		
		

	}

}
