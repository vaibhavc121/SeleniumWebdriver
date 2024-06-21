package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Addition
{
	@Test
	static void addition()
	{
		int a = 2, b = 2;
		SoftAssert SoftAssert = new SoftAssert();
		int add = a + b;
		int expected = 4;
		SoftAssert.assertEquals(add, expected, "test case pass");
		SoftAssert.assertAll();

	}

}
