package driver;

import functions.Actions;
import functions.Assertions;
import functions.Elements;
import functions.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final long IMPLICITLY_WAIT = 20L;
    static Waiters wait;
    static Actions actions;
    static Assertions assertions;
    static Elements elements;

    public static WebDriver startChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\sele\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait= new Waiters(driver);
        actions = new Actions(driver);
        assertions = new Assertions(driver);
        elements = new Elements(driver);
        return driver;
    }
}
