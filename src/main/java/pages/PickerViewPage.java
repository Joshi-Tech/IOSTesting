package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

public class PickerViewPage extends BasePage {

    public PickerViewPage(IOSDriver driver){
        super(driver);
    }

    public WebElement selectColor(String color){
      return   driver.findElement(AppiumBy.accessibilityId(color+" color component value"));
    }

    public void setColor(String color, String value ){
        selectColor(color).sendKeys(value);
    }

    public String getColorValue(String color){
       return selectColor(color).getAttribute("value");
    }

    public void selectValues(String red, String green, String blue){
      WebElement redValue = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypePickerWheel[`name == \"Red color component value\"`]"));
        WebElement greenValue = driver.findElement(AppiumBy.accessibilityId("Green color component value"));
        WebElement blueValue = driver.findElement(AppiumBy.accessibilityId("Blue color component value"));
        redValue.sendKeys(red);
        greenValue.sendKeys(green);
        blueValue.sendKeys(blue);
    }
}
