package pages;

//import tests.hook.BasePage;
import   io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

public class ActionSheetsPage extends BasePage {

    public ActionSheetsPage(IOSDriver driver) {
        super(driver);
    }

    public void clickOkCancel() {
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
    }

    public void clickOkButton() {
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"OK\"`]")).click();
    }

    public WebElement getHeader() {
        return driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Action Sheets\"`]"));
    }
}
