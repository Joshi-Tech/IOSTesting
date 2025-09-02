package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProgressViewPage extends BasePage {

    public ProgressViewPage(IOSDriver driver){
        super(driver);
    }

    public boolean defaultProgressBar(int number){
        List<WebElement> elementList= driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeProgressIndicator[`name == \"Progress\"`]"));
     String progressValue = elementList.get(number).getAttribute("value");
    Integer value = Integer.valueOf(progressValue.substring(0,2));
        System.out.println(value);
    return value >0;

    }


}
