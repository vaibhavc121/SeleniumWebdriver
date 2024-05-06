package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jewelry
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")).click();
		driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[3]"))
				.click();
		// driver.findElement(By.xpath("//button[normalize-space()='Rent']")).click();
		// driver.findElement(By.xpath("//ul[@class='top-menu
		// notmobile']//a[normalize-space()='Jewelry']")).click();
		// driver.findElement(By.xpath("//ul[@class='top-menu
		// notmobile']//a[normalize-space()='Jewelry']"));
		// driver.findElement(By.xpath("//input[@id='rental_start_date_40']")).sendKeys("5/7/2024");
		// driver.findElement(By.name("rental_end_date_40")).sendKeys("5/31/2024");
		driver.findElement(By.xpath("//input[@id='rental_end_date_40']")).click();
		driver.findElement(By.className("cart-label")).click();

	}

}
