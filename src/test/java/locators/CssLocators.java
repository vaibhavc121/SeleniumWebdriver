package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators
{

	public static void main(String[] args)
	{
		WebDriver ob = new ChromeDriver();
		ob.get("https://demo.nopcommerce.com/");
		ob.manage().window().maximize();

		// tag id | tag#id
		ob.findElement(By.cssSelector("input#small-searchterms")).sendKeys("apple");
		ob.findElement(By.cssSelector("#small-searchterms")).sendKeys("apple");

		// tag class | tag.class
		ob.findElement(By.cssSelector("input.search-box-text")).sendKeys("apple");

		// tag attribute | tag[attribute='value']
		ob.findElement(By.cssSelector("input[type='text']")).sendKeys("apple");
		ob.findElement(By.cssSelector("[type='text']")).sendKeys("apple");

		// tag class attribute | tag.class[attribute='value']
		ob.findElement(By.cssSelector("input.search-box-text[type='text']")).sendKeys("apple");
		ob.findElement(By.cssSelector(".search-box-text[type='text']")).sendKeys("apple");
	}

}
