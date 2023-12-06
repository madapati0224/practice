package day_24;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownwithSelectTag {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
	 driver.manage().window().maximize();
	 
	 // In dropdowns we use SELECT CLASS if we have select Tags
	 
// Xpath for dropdown element
	 
	 WebElement drpdown=driver.findElement(By.xpath("//select[@id='country-list']"));
	 
	 Select options=new Select(drpdown); //Select class 
	 
//Selecting an option from the dropdown
	 
   /*   options.selectByVisibleText("Brazil"); //By using visibility text
      Thread.sleep(1000);
	  options.selectByValue("2");//By using value attribute
	  Thread.sleep(1000);
	  options.selectByIndex(3);//By using index */
	 
//Find total no .of options in dropdown
	 
	List<WebElement> totaloptions= options.getOptions();//getOptions() avaliable to get no.of options
	 int size=totaloptions.size();
	 System.out.println("Total no.of options avaliable in dropdown:"+size);//6
	 
//print options in console window
	 //Using for loop
	 
	/* for(int i=0;i<totaloptions.size();i++) {
	String	optionnames= totaloptions.get(i).getText(); //Will return all names in the dropdown
	System.out.println(optionnames);
	
	 }*/
	 
	//Enhnced for loop
	 
	/* for(WebElement names:totaloptions) {
		System.out.println(names.getText());
		  }*/
	 

	 
	 
	 
	 
	 

	}

}
