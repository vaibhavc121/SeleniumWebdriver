package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0
{

	public static void main(String[] args)
	{
		WebDriver ob = new ChromeDriver();
		ob.get("https://demo.opencart.com/");
		ob.manage().window().maximize();

		// name
		// ob.findElement(By.name("search")).sendKeys("Mac");

		// id
//		boolean status = ob.findElement(By.id("logo")).isDisplayed();
//		System.out.println(status);

		// linktext and partial linktext
		// ob.findElement(By.linkText("Tablets")).click();
//		ob.findElement(By.partialLinkText("Tab")).click();

		// class name
//		List<WebElement> headerlinks = ob.findElements(By.className("list-inline-item"));
//		System.out.println("total no of header links: " + headerlinks.size());

		// tagname
//		List<WebElement> links = ob.findElements(By.tagName("a"));
//		System.out.println("total no of links: " + links.size());

		List<WebElement> img = ob.findElements(By.tagName("img"));
		System.out.println("total no of img: " + img.size());

	}

}
