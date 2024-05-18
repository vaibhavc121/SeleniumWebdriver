package dynamicPaginationTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		Integer row = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();

		for (int p = 1; p <= 4; p++)
		{
			driver.findElement(By.xpath("//a[normalize-space()=" + p + "]")).click();
			Thread.sleep(2000);

			for (int r = 1; r <= row; r++)
			{
				String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[2]"))
						.getText();
				String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[3]"))
						.getText();
				driver.findElement(
						By.xpath("//table[@id='productTable']//tr[" + r + "]//td[4]//input[@type='checkbox']")).click();
				System.out.println(name + "\t" + price);
			}

		}
	}

}
