package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultTest extends Multiplication
{
	@Test
	void multiplication()
	{
		int a = 2, b = 3;

		int exp = 4;
		int act = multi(a, b);
		Assert.assertEquals(act, exp);
	}
}
