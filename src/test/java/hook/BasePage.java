package hook;//package tests.hook;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.ios.IOSDriver;
//import org.openqa.selenium.WebElement;
//
//public class BasePage {
//    protected IOSDriver driver;
//
//    public BasePage(IOSDriver driver) {
//        this.driver = driver;
//    }
//
//    public WebElement getElementByChain(String optionName) {
//        return driver.findElement(AppiumBy.iOSClassChain(
//                "**/XCUIElementTypeStaticText[`name == \"" + optionName + "\"`]"));
//    }
//
//    protected WebElement getElementById(String optionName) {
//        return driver.findElement(AppiumBy.accessibilityId(optionName));
//    }
//}
