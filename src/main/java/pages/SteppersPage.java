package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class SteppersPage extends BasePage {

    public SteppersPage(IOSDriver driver){
        super(driver);
    }

    public WebElement runSteppers(String steppersType, int stepper) {
        String stepperType = String.format("**/XCUIElementTypeButton[`name == \"%s\"`]", steppersType);
        List<WebElement> element = driver.findElements(AppiumBy.iOSClassChain(stepperType));
        return element.get(stepper);
    }

    public int getSteppersCount(String incrementSteppers, String decrementSteppers, int stepper, int increment, int decrement){
        for(int i = 0;i<increment;i++){
            runSteppers(incrementSteppers,stepper).click();
        }
        int incrementCount = Integer.parseInt(Objects.requireNonNull(driver.findElement(AppiumBy.accessibilityId(String.valueOf(increment))).getAttribute("value")));
        System.out.println(incrementCount);
        for(int i = 0;i<decrement;i++){
            runSteppers(decrementSteppers,stepper).click();
        }
        int decrementCount = Integer.parseInt(Objects.requireNonNull(driver.findElement(AppiumBy.accessibilityId(String.valueOf(increment - decrement))).getAttribute("value")));
        System.out.println(decrementCount);
        return decrementCount;
    }
}
