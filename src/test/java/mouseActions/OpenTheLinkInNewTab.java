package mouseActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		WebElement link = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

		// switching to registration page

		List<String> ids = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(ids.get(1));

	}

}
