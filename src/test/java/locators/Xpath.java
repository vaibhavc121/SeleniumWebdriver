package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{

	public static void main(String[] args)
	{
		WebDriver ob = new ChromeDriver();
		ob.get("https://demo.opencart.com/");
		// xpath with single attribute
//		ob.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("apple");
//		// xpath with multiple attribute
//		ob.findElement(By.xpath("//input[@autocomplete='off'][@id='small-searchterms']"));
//
//		// xpath with 'and' operator
//		ob.findElement(By.xpath("//input[@autocomplete='off' and @id='small-searchterms']"));
//
//		// xpath with 'and' operator
//		ob.findElement(By.xpath("//input[@autocomplete='off' or @id='small-searchterms']"));
//		
//		//Xpath with inner text- text()
//		ob.findElement(By.xpath("//a[text()='Desktops']"));
//		
		Boolean display = ob.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(display);

		String value = ob.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);

		if (value.equals("Featured"))
		{
			System.out.println("value is correct");
		}
		else
		{
			System.out.println("value is not correct");
		}

	}

}
