package webDriverMethods;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands
{

	public static void main(String[] args) throws MalformedURLException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.get("https://demo.nopcommerce.com/");
		// driver.navigate().to("https://demo.nopcommerce.com/");

//		URL myurl = new URL("https://demo.nopcommerce.com/");
//		driver.navigate().to(myurl);

		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://skillrary.com/");

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();

	}

}
