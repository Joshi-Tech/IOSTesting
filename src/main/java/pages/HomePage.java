package pages;

//import tests.hook.BasePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(IOSDriver driver) {
        super(driver);
    }

    public void goToButtonsPage() {
        getElementById("Buttons").click();
    }

    public void goToDatePickerPage() {
        getElementByChain("Date Picker").click();
    }

    public void goToActionSheetsPage() {
        getElementByChain("Action Sheets").click();
    }

    public WebElement getHeader() {
        return getElementByChain("UICatalog");
    }

    public WebElement goToPickerViewPage() {
        return getElementByChain("Picker View");
    }

    public WebElement goToAlertViewPage(){
        return getElementById("Alert Views");
    }

    public WebElement gotToSegmentedControlsPage(){
        return getElementByChain("Segmented Controls");
    }

    public WebElement goToProgressViewsPage(){
        return getElementByChain("Progress Views");
    }

    public WebElement goToSteppersPage(){
        return getElementByChain("Steppers");
    }

    public WebElement goToSlidersPage(){
        return getElementByChain("Sliders");
    }
}
