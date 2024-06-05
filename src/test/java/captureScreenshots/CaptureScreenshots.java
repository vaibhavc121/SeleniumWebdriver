package captureScreenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots
{

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		// full page screenshot
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File sourceFile =
		 * ts.getScreenshotAs(OutputType.FILE); File targFile = new
		 * File(System.getProperty("user.dir") + "\\screenshots\\fullpage.png");
		 * sourceFile.renameTo(targFile); // copy source file to target file
		 */
		// Capture the screenshot of specific section
		WebElement table = driver.findElement(By.cssSelector("#HTML1"));
		File sourceFile = table.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + "\\screenshots\\table.png");
		sourceFile.renameTo(targetFile); // copy source file to target file

	}

}
