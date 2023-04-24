package peninsula;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://peninsula.ua/");

        WebElement loginIcon = (new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='header-login__icon']"))));

        loginIcon.click();

        WebElement loginIcon2 = (new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='btn btn-primary logbut']"))));
        loginIcon2.click();

        WebElement name = (new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname']"))));

        name.sendKeys("Meandme");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Привет");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dertyq@qwe.rie");
        driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("21234532");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("123456789");

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        //driver.quit();
    }
}
