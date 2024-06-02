package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage
{

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1.Scroll down the page by pixel number
		/*
		 * js.executeScript("window.scrollBy(0,300)", "");
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 */

		// 2.Scroll the page till element is visible
		// When we get the exception element is not visible that time it is useful
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath("//h2[normalize-space()='Pagination Table']"));
		 * js.executeScript("arguments[0].scrollIntoView();", ele);
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 */

		// 3.Scroll Page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));

		// Scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
