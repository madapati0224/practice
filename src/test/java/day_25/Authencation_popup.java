package day_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//After url open the application pop up will display
public class Authencation_popup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	
//Here along with url only we have enter inputs bec for alertwindow we can't inspect		
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin1@the-internet.herokuapp.com/basic_auth //@diver the logindetains and url
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		
		if(text.contains("Congratulations"))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("login failed");
		}
		
	}

}
