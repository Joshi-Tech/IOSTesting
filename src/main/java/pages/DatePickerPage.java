package pages;

//import tests.hook.BasePage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatePickerPage extends BasePage {

    public DatePickerPage(IOSDriver driver) {
        super(driver);
    }

    public WebElement getTodayDate() {
        LocalDate localDate = LocalDate.now();
        String dateLocator = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH).format(localDate);
        return driver.findElement(AppiumBy.accessibilityId(dateLocator));
    }
}
