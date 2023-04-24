package pages;

import functions.Actions;
import functions.Assertions;
import functions.Elements;
import functions.Waiters;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    static Waiters wait;
    static Actions actions;
    static Assertions assertions;
    static Elements elements;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new Waiters(driver);
        actions = new Actions(driver);
        assertions=new Assertions(driver);
        elements=new Elements(driver);
    }
    public void openUrl(String url){
        driver.get(url);
    }
}
