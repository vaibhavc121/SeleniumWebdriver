package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome");
		Actions act = new Actions(driver);

		// ctrl+A select the text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// ctrl+c copy the text into clipboard
		act.keyDown(Keys.CONTROL).sendKeys("X").keyUp(Keys.CONTROL).perform();

		// tab shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		// ctrl+v paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
