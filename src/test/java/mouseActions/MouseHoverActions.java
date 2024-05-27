package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		WebElement comp = driver
				.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement desktop = driver
				.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"));

		Actions act = new Actions(driver);
		act.moveToElement(comp).moveToElement(desktop).click().build().perform();

	}

}
