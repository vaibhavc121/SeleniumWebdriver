package nopcommerce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).click();
		driver.findElement(By.xpath("//a[@href='/manufacturer/all']")).click();
		// driver.findElement(By.xpath("//a[@class='product-name'][normalize-space()='Fahrenheit
		// 451 by Ray Bradbury']")).click();
		// driver.findElement(By.xpath("//a[normalize-space()='1 review(s)']")).click();
		// driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Show products manufactured by Apple'][normalize-space()='Apple']"))
				.click();
		driver.findElement(By.linkText("apparel")).click();
		driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
		driver.findElement(By.id("newsletter-email")).sendKeys("vaibhav@gmail.com");
		driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).click();
		driver.findElement(By.partialLinkText("About ")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Facebook")).click();
		Set<String> winid = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(winid);
		String parent = list.get(1);
		String child = list.get(0);
		driver.switchTo().window(parent);
		// driver.switchTo().window(child);

	}

}
