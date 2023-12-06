package day_35;

import org.testng.annotations.*;

public class Class4 {
	@Test
	void product()
	{
		System.out.println("product");
	}
	@AfterTest
	void logout()
	{
		System.out.println("logout");
	}


}
