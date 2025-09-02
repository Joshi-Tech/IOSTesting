package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

public class SegmentedControlsPage extends BasePage {

    public SegmentedControlsPage(IOSDriver driver){
        super(driver);
    }

    public WebElement getButtonType(String button){
        return driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == '"+button+"' `][2]"));
    }

    public String getTintedButtonTypeClicked(String tintedButton){
       getButtonType(tintedButton).click();
      return getButtonType(tintedButton).getAttribute("value");
    }
}
