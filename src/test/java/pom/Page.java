package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//without page factory class
public class Page
{
	WebDriver driver; // declared in class level

	Page(WebDriver d) // constructor which initiate the driver automatically
	{
		// this.driver=driver;
		driver = d;
	}

	// locating elements (locators)
	By name = By.id("name");
	By email = By.id("email");
	By phone = By.id("phone");
	By add = By.id("textarea");

	// action methods
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
