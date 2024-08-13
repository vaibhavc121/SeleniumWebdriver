package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends Addition
{
	@Test
	void test()
	{
		int res = add(2, 1);
		int exp = 4;
		Assert.assertEquals(res, exp);

	}

}
