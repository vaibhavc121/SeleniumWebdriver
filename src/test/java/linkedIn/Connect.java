package linkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Connect
{
    @Test
    public void automateConnect()
    {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.linkedin.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Guneet Singh");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(//span[@aria-hidden='true'])[4]")).click();
        driver.findElement(By.xpath("(//span[@class='link-without-visited-state'])[1]")).click();

        for(int i=1;i<32;i++)
        {
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[25]")).click();


            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[12]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[13]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[14]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[15]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[16]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[17]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[18]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[19]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[20]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }
            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[21]")).click();
            if(driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).isDisplayed())
            {
                driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[3]")).click();
            }


            driver.findElement(By.xpath("(//span[@class='artdeco-button__text'])[23]")).click();
        }
    }
}