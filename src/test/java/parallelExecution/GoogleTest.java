package parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void openGoogle() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://hcm.onenfinity.com/Attendance/Home");
        //System.out.println("Title: " + driver.getTitle() + " | Thread ID: " + Thread.currentThread().getId());
        driver.findElement(By.name("Username")).sendKeys("vaibhav@test.com");
        driver.findElement(By.name("Password")).sendKeys("123");
        driver.findElement(By.xpath("(//span[@class='dx-button-text'])[1]")).click();
    }
}