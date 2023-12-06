package day_35;

import org.testng.annotations.*;

public class Annotationdemo_1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search");	
	}
	
	@Test(priority=2)
	void Advancedsearch()
	{
		System.out.println("Advancedsearch");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}

}
