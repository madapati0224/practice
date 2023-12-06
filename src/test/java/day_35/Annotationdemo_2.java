package day_35;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationdemo_2 {
	
	
		@BeforeClass
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
		
		@AfterClass
		void logout()
		{
			System.out.println("logout");
		}

	}


