package exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoSuchElementException
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		try
		{
			driver.findElement(By.id("nam")).sendKeys("vaibhav");
		}
		catch (Exception e)
		{
			// System.out.println(e);
			// e.getMessage();
			// e.printStackTrace();
			System.out.println("invalid locator");
		}

		// driver.findElement(By.id("name")).sendKeys("vaibhav");
		driver.findElement(By.id("email")).sendKeys("email");

//		try
//		{
//			driver.findElement(By.id("email")).sendKeys("email");
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}

		driver.findElement(By.id("phone")).sendKeys("phone");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

}
