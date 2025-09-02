package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.List;

public class SlidersPage extends BasePage {

    public SlidersPage(IOSDriver driver) {
        super(driver);
    }

    public void moveDefaultSliderToTheRight() {
        List<WebElement> elementList = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider"));
        elementList.get(0).sendKeys("0.7");
        elementList.get(0).sendKeys("0.2");
        System.out.println(elementList.stream().map(x -> x.getAttribute("value")).toList());
    }

    public void moveDefaultSliderByDragging() {
        List<WebElement> elementList = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider"));
        int X = elementList.get(0).getLocation().getX(); //This provides the current location of the slider in X-axis
        int Y = elementList.get(0).getLocation().getY(); //This provides the thickness of the slider
        int endX = X + elementList.get(0).getSize().getWidth(); // this gives full width of the slider
        int centreY = elementList.get(0).getSize().getHeight();
        int centerY = Y + (Y / 2);


        int midX = elementList.get(0).getSize().getWidth() / 2;
        int heightX = elementList.get(0).getSize().getHeight();
        PointerInput iOSInput = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tapSequence = new Sequence(iOSInput, 1);
        tapSequence.addAction(iOSInput.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),
                X + 1, centerY));
        tapSequence.addAction(iOSInput.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tapSequence.addAction(iOSInput.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(),
                endX - 5, centerY));
        tapSequence.addAction(iOSInput.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tapSequence));
    }
}
