package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
test case
-----
1) Launch browser (chrome)
2) Open URL https://demo.opencart.com/
3) Validate title should be "Your Store"
4)close browser
*/
public class Test0
{

	public static void main(String[] args)
	{
		// ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String act_title = driver.getTitle();

		if (act_title.equals("Your Store"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}

	}

}
