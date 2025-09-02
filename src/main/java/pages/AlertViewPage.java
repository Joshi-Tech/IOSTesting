package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;

public class AlertViewPage extends BasePage {

    public AlertViewPage(IOSDriver driver) {
        super(driver);
    }

    public void clickAlertOption(String alertOption){
        driver.findElement(AppiumBy.accessibilityId(alertOption)).click();
    }

    public String getSimpleHeader(String alertOption) {
        clickAlertOption(alertOption);
        return driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeAlert[`name == \"A Short Title Is Best\"`]")).getText();
    }

    public String getSimpleMainMessage() {
        return driver.findElement(AppiumBy.accessibilityId("A message should be a short, complete sentence.")).getText();
    }

    public void enterText(String alertOption){
        clickAlertOption(alertOption);
        driver.findElement(AppiumBy.accessibilityId("Text Entry"));
    }
}
