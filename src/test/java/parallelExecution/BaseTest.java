package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) {
        DriverFactory.initDriver(browser);
        WebDriver driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //DriverFactory.quitDriver();
    }
}