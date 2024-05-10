package flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
//		driver.findElement(By.xpath("//div[normalize-space()='My Profile']")).click();

		// -- hover- action class
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(ele).perform();
//		driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']")).click();

		/*
		 * driver.findElement(By.xpath("//span[text()='Fashion']")).click();
		 * driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']")).click();
		 * driver.findElement(By.cssSelector(
		 * "div[data-id='SHTGZEKBQWDEQWMF'] div[class='_1sdMkc LFEi7Z'] a[class='rPDeLR'] div div img[class='_53J4C-']"
		 * )) .click();
		 * driver.findElement(By.xpath("//div[normalize-space()='METRONAUT']")).click();
		 * Set<String> set = driver.getWindowHandles(); List<String> list = new
		 * ArrayList<String>(set);
		 * 
		 * String child = list.get(1);
		 * 
		 * driver.switchTo().window(child);
		 */

		// --appliances

		driver.findElement(By.xpath("//span[@class='_1XjE3T']//span[contains(text(),'Appliances')]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Kodak Televisions']")).click();
		Select select = new Select(driver.findElement(By.xpath("//div[@class='suthUA']//select[@class='Gn+jFg']")));
		select.selectByValue("60000");
		driver.findElement(By.xpath("//div[@class='suthUA']//select[@class='Gn+jFg']")).click();
		driver.findElement(By.xpath("//div[@title='SAMSUNG']//div[@class='XqNaEv']")).click();
		driver.findElement(By.xpath(
				"//div[normalize-space()='Mi Q1 189.34 cm (75 inch) QLED Ultra HD (4K) Smart Android TV With Reality Flow | Local Dimming | Dolb...']"))
				.click();
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		String parent = list.get(1);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[normalize-space()='50']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='2023']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Buy Now']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vaibhav@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='CONTINUE']")).click();

	}

}
