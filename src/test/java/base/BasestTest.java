package base;

import driver.DriverFactory;
import functions.Actions;
import functions.Assertions;
import functions.Elements;
import functions.Waiters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import pages.BasePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.DragandDropDemo;

public class BasestTest {
    static final Logger logger = LoggerFactory.getLogger(BasestTest.class);
    protected WebDriver driver = DriverFactory.startChromeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Waiters wait = new Waiters(driver);
    protected Actions actions = new Actions(driver);
    protected Assertions assertions = new Assertions(driver);
    protected Elements elements= new Elements(driver);
    protected DragandDropDemo dragandDropDemo = new DragandDropDemo(driver);

    @AfterClass
    public void stopTest(){
        logger.info("Closing Driver");
        driver.quit();
    }

}
