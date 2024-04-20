package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();

		// isDisplayed()-- this method is applicable for all kind of elements
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());

		// isEnabled()
		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(status);

		// isSelected()
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

		System.out.println("before selection");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		System.out.println("after selection male");
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

	}

}
