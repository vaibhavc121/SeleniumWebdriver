package nopcommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Giftcards
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		select.selectByValue("5");

		Select select1 = new Select(driver.findElement(By.xpath("//select[@id='products-pagesize']")));
		select1.selectByVisibleText("9");

		driver.findElement(By.xpath("//div[@class='picture']//img[@title='Show details for $25 Virtual Gift Card']"))
				.click();
		driver.findElement(By.className("recipient-name")).sendKeys("vaibhav");
		driver.findElement(By.name("giftcard_45.SenderName")).sendKeys("rahul");
		driver.findElement(By.tagName("textarea")).sendKeys("msg");
		driver.findElement(By.cssSelector("#add-to-cart-button-45")).click();
		driver.findElement(By.cssSelector(".cart-label")).click();

	}

}
