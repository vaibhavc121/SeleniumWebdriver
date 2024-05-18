package dynamicPaginationTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.opencart.com/admin/index.php");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}

		// driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		Integer tot = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));

		// repeating pages
		for (int p = 1; p <= 5; p++)
		{
			if (p > 1)
			{
				WebElement active_pg = driver.findElement(By.xpath("//a[normalize-space()=" + p + "]"));
				active_pg.click();
				Thread.sleep(3000);
			}

			// reading data from the page
			Integer rows = driver
					.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

			for (int r = 1; r <= rows; r++)
			{
				String cust_name = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[2]"))
						.getText();
				String email = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[3]"))
						.getText();
				System.out.println(cust_name + "\t" + email);
			}
		}

	}

}
