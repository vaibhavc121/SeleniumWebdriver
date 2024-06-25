package testNG;

import org.testng.annotations.Test;

public class Test0
{
	@Test(priority = 1)
	void openapp()
	{
		System.out.println("opening app");
	}

	@Test(priority = 2)
	void login()
	{
		System.out.println("login ");
	}

	@Test(priority = 3)
	void logout()
	{
		System.out.println("logout");
	}
}
