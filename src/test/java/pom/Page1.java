package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class Page1
{
	WebDriver driver;

	// identify the elements which are present in the page
	@FindBy(id = "name")
	WebElement name;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "phone")
	WebElement phone;
	@FindBy(id = "textarea")
	WebElement textarea;

	public Page1(WebDriver d)
	{
		// this.driver=driver;
		driver = d;
		PageFactory.initElements(d, this); // this method will create web element
	}

	public void setName(String sname)
	{
		name.sendKeys(sname);
	}

	public void setEmail(String semail)
	{
		email.sendKeys(semail);
	}

	public void setPhone(String sphone)
	{
		phone.sendKeys(sphone);
	}

	public void setAdd(String sadd)
	{
		textarea.sendKeys(sadd);
	}
}
