package day_35;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependentsOnMethods {
	@Test(priority=1)
	void Openapp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	void Login()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods={"Login"})
	void Search()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=4,dependsOnMethods= {"Login","Search"})
	void Advancesearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods={"Login"})
	void Logout()
	{
		Assert.assertTrue(true);
	}

}
