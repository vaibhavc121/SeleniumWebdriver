package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory class
public class Page1
{
	WebDriver driver;

	public Page1(WebDriver d) // constructor which initiate the driver automatically
	{
		// this.driver=driver;
		driver = d;
		PageFactory.initElements(d, this); // mandatory statement
											// this method will make sure this driver is applicable for all kinds of
											// elements bcos in below without using drive we are finding the elements.
											// in short initiate all the elements using driver

	}

	// identify the elements which are present in the page (locators)
	@FindBy(id = "name") // this statement find the element and store in the variable.
							// FindBy-findElement()
	WebElement name;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "phone")
	WebElement phone;
	@FindBy(id = "textarea")
	WebElement textarea;

	// when u find group of web elements
	@FindBy(tagName = "a")
	List<WebElement> links;

	// action methods
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
