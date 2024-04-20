package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(5000);

		ob.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(10000);

		ob.close();
		ob.quit();

	}

}
