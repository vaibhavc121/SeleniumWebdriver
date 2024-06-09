package headlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTeting
{

	public static void main(String[] args)
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless=new"); // setting for headless mode of execution
		WebDriver driver = new ChromeDriver(op);
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

		// driver.quit()
		// driver.close();

	}

}
