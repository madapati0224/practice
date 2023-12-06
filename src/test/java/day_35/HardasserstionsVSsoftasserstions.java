package day_35;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class HardasserstionsVSsoftasserstions {
	//@Test
	void Hard_Assert()
	{
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		
		Assert .assertEquals(1, 2); //if it  fail then below statement will not be executed..
		
		System.out.println("hard assertion completed.....");
		Assert.assertEquals(1, 1);
	}
	@Test
	void Soft_Assert()
	{
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		System.out.println("Testing......");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2 ); //If softassert fail also will execute rest of the statements
		
		System.out.println("hard assertion completed.....");
		//Assert.assertEquals(1, 1);
	
		sa.assertAll();// mandatory
		
	}

}
