package Script;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ob = new ChromeDriver();
		ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ob.manage().window().maximize();
//		ob.findElement(By.xpath("")).click();

//		ob.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
//
//		ob.findElement(By.xpath("//a[normalize-space()='Components']")).click();
//		//ob.findElement(By.xpath("//a[normalize-space()='Mice and Trackballs (0)']")).click();
//		ob.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a")).click();

		ob.get("https://demo.nopcommerce.com/");
		ob.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
		ob.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
		ob.findElement(By.xpath("//img[@title='Show details for Build your own computer']")).click();

		Select select = new Select(ob.findElement(By.xpath("//select[@id='product_attribute_1']")));
		select.selectByValue("1");

		Select select1 = new Select(ob.findElement(By.xpath("//select[@id='product_attribute_2']")));
		select1.selectByValue("4");

		ob.findElement(By.xpath("//input[@id='product_attribute_3_7']")).click();
		// ob.findElement(By.xpath("//input[@id='product_attribute_5_12']")).click();
		List<WebElement> cbox = ob.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 1; i < cbox.size(); i++)
		{
			cbox.get(i).click();
		}
		Thread.sleep(5000);
		ob.findElement(By.xpath("//button[@id='add-to-cart-button-1']")).click();
		ob.findElement(By.xpath("//span[@class='cart-label']")).click();
		ob.findElement(By.xpath("//input[@id='termsofservice']")).click();
		ob.findElement(By.xpath("//button[@id='checkout']")).click();
		ob.findElement(By.xpath("//input[@id='Email']")).sendKeys("rohitc121@gmail.com");
		ob.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
		ob.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		String url = ob.getCurrentUrl();

		if (url.equals("https://demo.nopcommerce.com/login?returnurl=%2Fcart"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}

		Thread.sleep(2000);
		ob.quit();

	}

}
