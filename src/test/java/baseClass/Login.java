package baseClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseClass
{
	@Test(description = "perform login task")
	public void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

}
