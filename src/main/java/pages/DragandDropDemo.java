package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class DragandDropDemo extends BasePage{
    public DragandDropDemo(WebDriver driver){
        super(driver);
    }
    private static class Label{
        private static final String url = "https://demo.guru99.com/test/drag_drop.html";
    }
    private static class Locators{
        private final static By first5000 = By.xpath("//li[@id='credit']/following-sibling::li[1]");
        private final static By second5000 = By.xpath("//li[@id='credit']/following-sibling::li[3]");
        private final static By bankButton = By.xpath("//li[@data-id='5']");
        private final static By salesButton = By.xpath("//li[@data-id='6']");
        private final static By bankFieldToDrop = By.xpath("//ol[@id='bank']");
        private final static By fieldForFirst5000ToDrop = By.xpath("//ol[@id='amt7']");
        private final static By fieldForSalesDrop = By.xpath("//ol[@id='loan']");
        private final static By fieldForSecond5000ToDrop = By.xpath("//ol[@id='amt8']");
        private final static By perfectResultText = By.xpath("//div[@id='equal']/a/text()");
        private final static By bankFieldToDropText = By.xpath("//ol[@id='bank']/li");
        private final static By fieldForFirst5000ToDropText = By.xpath("//ol[@id='amt7']/li");
        private final static By fieldForSalesDropText = By.xpath("//ol[@id='loan']/li");
        private final static By fieldForSecond5000ToDropText = By.xpath("//ol[@id='amt8']/li");
        private final static By acceptCookies = By.xpath("//span[text()='Принять всё']");
        private final static By iframeCookies = By.xpath("//iframe[@aria-label='Окно диспетчера конфиденциальности']");




    }
    public void openUrl(){
        super.openUrl(Label.url);
    }
    public void dragAndDropElement(By by1, By by2 ){
        actions.dragNDropElement(by1,by2);
    }
    public void dragNDropfirst5000(){
        dragAndDropElement(Locators.first5000,Locators.fieldForFirst5000ToDrop);
    }
    public void dragNDropSecond5000(){
        dragAndDropElement(Locators.second5000,Locators.fieldForSecond5000ToDrop);
    }
    public void dragNDropBank(){
        dragAndDropElement(Locators.bankButton,Locators.bankFieldToDrop);
    }
    public void dragNDropSales(){
        dragAndDropElement(Locators.salesButton,Locators.fieldForSalesDrop);
    }
    public void fullDrop(){
        dragNDropBank();
        dragNDropSecond5000();
        dragNDropfirst5000();
        dragNDropSales();
    }

}
