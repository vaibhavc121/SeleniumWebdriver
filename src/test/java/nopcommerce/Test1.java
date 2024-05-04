package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		ob.findElement(By.xpath("")).click();		

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("apple");
		driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-wishlist-button-4']")).click();
		driver.findElement(By.xpath(
				"//div[@class='compare-products']//button[@type='button'][normalize-space()='Add to compare list']"))
				.click();
		driver.findElement(By.xpath("//button[normalize-space()='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("rohit@gmail.com");
		driver.findElement(By.name("YourEmailAddress")).sendKeys("vaibhav@gmail.com");
		driver.findElement(By.cssSelector("#PersonalMessage")).sendKeys("invite");
		driver.navigate().back();
		// driver.navigate().back();

		Thread.sleep(3000);

		String url = driver.getCurrentUrl();

		if (url.equals("https://demo.nopcommerce.com/apple-macbook-pro-13-inch"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}

		driver.findElement(By.cssSelector(".wishlist-label")).click();
		driver.findElement(By.xpath("//input[@name='addtocart']")).click();
		driver.findElement(By.cssSelector("button[name='addtocartbutton']")).click();
		// driver.findElement(By.xpath("//div[@id='quantity-up-11224']")).click();
		// driver.findElement(By.xpath("//input[@id='itemquantity11224' and
		// @name='itemquantity11224']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rohitc121@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

	}

}
