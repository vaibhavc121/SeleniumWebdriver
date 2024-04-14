package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{

	public static void main(String[] args)
	{
		WebDriver ob = new ChromeDriver();
		ob.get("https://demo.nopcommerce.com/");
		// xpath with single attribute
		ob.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("apple");
		// xpath with multiple attribute
		ob.findElement(By.xpath("//input[@autocomplete='off'][@id='small-searchterms']"));

		// xpath with 'and' operator
		ob.findElement(By.xpath("//input[@autocomplete='off' and @id='small-searchterms']"));

		// xpath with 'and' operator
		ob.findElement(By.xpath("//input[@autocomplete='off' or @id='small-searchterms']"));

	}

}
