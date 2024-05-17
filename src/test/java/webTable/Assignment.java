package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://blazedemo.com/");
		WebElement element = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select select = new Select(element);
		select.selectByIndex(2);

		WebElement element1 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select1 = new Select(element1);
		select1.selectByIndex(2);

		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		String a[] = new String[10];
		for (int i = 1; i <= 5; i++)
		{
			String data = driver.findElement(By.xpath("//table[@class='table']//tr[" + i + "]//td[6]")).getText();
			// System.out.println(data);

			a[i] = data;

		}

		for (int i = 1; i <= 5; i++)
		{
			if (a[i].contains("$472.56"))

			{
				driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();

			}
		}
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("vaibhav");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		// String text =driver.findElement(By.xpath("//input[@value='Purchase
		// Flight']")).getText();
		Boolean text = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']"))
				.isDisplayed();
		if (text.equals(true))
		{
			System.out.println("passed");
		}
	}

}
