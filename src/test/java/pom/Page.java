package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without page factory
public class Page
{
	WebDriver driver;

	// locating elements
	By name = By.id("name");
	By email = By.id("email");
	By phone = By.id("phone");
	By add = By.id("textarea");

	Page(WebDriver d)
	{
		// this.driver=driver;
		driver = d;
	}

	public void setName(String sname)
	{
		driver.findElement(name).sendKeys(sname);
	}

	public void setEmail(String semail)
	{
		driver.findElement(email).sendKeys(semail);
	}

	public void setPhone(String sphone)
	{
		driver.findElement(phone).sendKeys(sphone);
	}

	public void setAdd(String sadd)
	{
		driver.findElement(add).sendKeys(sadd);
	}

}
