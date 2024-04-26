package webDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowids = driver.getWindowHandles();

		/*
		 * List<String> windowList = new ArrayList<String>(windowids);
		 * 
		 * String parentid = windowList.get(0); String childid = windowList.get(1);
		 * 
		 * driver.switchTo().window(childid); System.out.println(driver.getTitle());
		 * 
		 * driver.switchTo().window(parentid); System.out.println(driver.getTitle());
		 */

		// approach 2

		for (String winid : windowids)
		{
			String title = driver.switchTo().window(winid).getTitle();

			if (title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
