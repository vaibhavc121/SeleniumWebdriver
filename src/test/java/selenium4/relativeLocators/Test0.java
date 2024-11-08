package selenium4.relativeLocators;

import static org.openqa.selenium.support.locators.RelativeLocator.with; //need to import this package

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://codenboxautomationlab.com/practice/");

		// example of above(). finding an element above of openTab
		WebElement openTab = driver.findElement(By.id("opentab"));
		String swichtab = driver.findElement(with(By.tagName("legend")).above(openTab)).getText();
		System.out.println(swichtab);

		// example of below method(). finding a textbox below of enabled-button
		WebElement btn = driver.findElement(By.id("enabled-button"));
		driver.findElement(with(By.tagName("input")).below(btn)).sendKeys("vaibhav");

		// example of near method().
		WebElement txt = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
		driver.findElement(with(By.tagName("input")).near(txt)).click();

		// example of toLeftOf()
		WebElement showtxt = driver.findElement(By.id("show-textbox"));
		driver.findElement(with(By.tagName("input")).toLeftOf(showtxt)).click();

		// example of toRightOf()
		WebElement txtbox = driver.findElement(By.id("name"));
		driver.findElement(with(By.tagName("input")).toRightOf(txtbox)).click();
	}

}
