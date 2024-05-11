package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://login.onenfinity.com/User/Login");
		driver.findElement(By.name("Username")).sendKeys("admin@demo.com");
		driver.findElement(By.name("Password")).sendKeys("123");
		driver.findElement(By.xpath("//span[@class='dx-button-text']")).click();

		// driver.findElement(By.xpath("//span[normalize-space()='Asset
		// Issue']")).click();
		driver.findElement(By.cssSelector("a[title='Asset Issue'] span[class='dx-vam']")).click();
		driver.findElement(By.xpath("//img[@id='MainMenu_DXI0_Img']")).click();
		driver.findElement(By.cssSelector(
				"div[id='bd47d71e-df19-4b72-80cd-253db9760de2'] i[class='dx-icon plus-icon white-color-icon']"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"HrAssetIssue.EmployeeIdLookup_B-1Img\"]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'76 | Adrian Baird')]")).click();
	}

}
